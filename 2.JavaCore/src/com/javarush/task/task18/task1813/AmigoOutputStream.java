package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream FOS;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream FO) throws FileNotFoundException {
        super(fileName);
        this.FOS = FO;
    }

    @Override
    public void flush() throws IOException {
        FOS.flush();
    }

    @Override
    public void write(int b) throws IOException {
        FOS.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        FOS.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        FOS.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        FOS.flush();
        FOS.write("JavaRush © All rights reserved.".getBytes());
        FOS.close();
    }
}
