package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (!message.contains(": ")) return;
            String name = message.substring(0, message.indexOf(":"));
            String text = message.substring(message.indexOf(":") + 2);
            SimpleDateFormat sdf = null;
            switch (text) {
                case "дата":
                    sdf = new SimpleDateFormat("d.MM.YYYY");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "день":
                    sdf = new SimpleDateFormat("d");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "месяц":
                    sdf = new SimpleDateFormat("MMMM");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "год":
                    sdf = new SimpleDateFormat("YYYY");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "время":
                    sdf = new SimpleDateFormat("H:mm:ss");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "час":
                    sdf = new SimpleDateFormat("H");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "минуты":
                    sdf = new SimpleDateFormat("m");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
                case "секунды":
                    sdf = new SimpleDateFormat("s");
                    sendTextMessage("Информация для " + name + ": " + sdf.format(Calendar.getInstance().getTime()));
                    break;
            }
        }
    }


    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return ("date_bot_" + (int) (Math.random() * 100));
    }
}
