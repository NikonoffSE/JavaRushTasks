package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream AOS;

    public QuestionFileOutputStream(AmigoOutputStream a) {
        this.AOS = a;
    }

    @Override
    public void flush() throws IOException {
        AOS.flush();
    }

    @Override
    public void write(int b) throws IOException {
    AOS.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        AOS.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        AOS.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        if (bu.readLine().equals("Д"))
        AOS.close();
    }
}

