package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class Server {
    private static ServerSocket serverSocket;
    private static Map<String, Connection> connectionMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        System.out.println("Введите порт");
        int port = ConsoleHelper.readInt();
        serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен");
        try {

            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Map.Entry e : connectionMap.entrySet()) {
                ((Connection) e.getValue()).send(message);
            }
        } catch (IOException e) {
            System.out.println("Не удалось отправить сообщение пользователям");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            ConsoleHelper.writeMessage("Установлено  соединение с " + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)) {

                userName = serverHandshake(connection);
                Server.sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (IOException e) {
                ConsoleHelper.writeMessage("Error");
            } catch (ClassNotFoundException x) {
                ConsoleHelper.writeMessage("Error");
            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            Message message = new Message(MessageType.USER_ADDED, userName);
            for (Map.Entry<String, Connection> e : connectionMap.entrySet()) {
                if (!userName.equals(e.getKey()))
                    connection.send(new Message(MessageType.USER_ADDED, e.getKey()));
                //e.getValue()
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            Message t;
            while (true) {
                t = connection.receive();
                if (t.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + t.getData()));
                } else {
                    ConsoleHelper.writeMessage("Ошибка сообщения");
                }
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message temp;
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Введите имя пользователя"));
                temp = connection.receive();
                if (temp.getType() == MessageType.USER_NAME && !temp.getData().isEmpty() && !connectionMap.containsKey(temp.getData())) {
                    connectionMap.put(temp.getData(), connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return temp.getData();
                }
            }
        }
    }
}
