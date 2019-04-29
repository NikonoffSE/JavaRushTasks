package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.*;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        Client c = new Client();
        c.run();
    }

    public class SocketThread extends Thread {

        public void run() {
            try {
                connection = new Connection(new Socket(getServerAddress(), getServerPort()));
                clientHandshake();
                clientMainLoop();
            }
            catch (IOException | ClassNotFoundException e){
                notifyConnectionStatusChanged(false);
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST)
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                else {
                    if (message.getType() == MessageType.NAME_ACCEPTED) {
                        notifyConnectionStatusChanged(true);
                        break;
                    }
                    else
                        throw new IOException("Unexpected MessageType");
                }

            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            while (true){
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT)
                    processIncomingMessage(message.getData());
                else{
                    if (message.getType() == MessageType.USER_ADDED)
                        informAboutAddingNewUser(message.getData());
                    else{
                        if (message.getType() == MessageType.USER_REMOVED)
                            informAboutDeletingNewUser(message.getData());
                        else
                            throw new IOException("Unexpected MessageType");
                    }
                }

            }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + "присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + "покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            synchronized (Client.this) {
                Client.this.clientConnected = clientConnected;
                Client.this.notify();
            }
        }
    }

    public void run() {
        Thread t = getSocketThread();

        t.setDaemon(true);
        t.start();
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("");
            Thread.currentThread().interrupt();

        }

        if (clientConnected == false) ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        else {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
            while (clientConnected) {
                String s = ConsoleHelper.readString();
                if (s.equals("exit")) clientConnected = false;
                else {
                    if (shouldSendTextFromConsole())
                        sendTextMessage(s);
                }
            }
        }
    }

    protected String getServerAddress() {
        System.out.println("Введите адрес сервера");
        return ConsoleHelper.readString();
    }

    protected String getUserName() {
        System.out.println("Введите имя пользователя");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            System.out.println("Ошибка отправки сообщения");
            clientConnected = false;
        }

    }

    protected int getServerPort() {
        System.out.println("Введите порт сервера");
        return ConsoleHelper.readInt();
    }
}
