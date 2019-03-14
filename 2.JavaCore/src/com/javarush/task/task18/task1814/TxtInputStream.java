package com.javarush.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
        private FileInputStream FIS;
    public TxtInputStream(String fileName) throws FileNotFoundException,  IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.substring(fileName.length()-4).equals(".txt")) {
            FIS = new FileInputStream(fileName);
        }
        else {
            if(!fileName.endsWith(".txt")) {
                super.close();
                throw new UnsupportedFileNameException();

            }
            }

    }

    public static void main(String[] args) {
       // String s = "c:/1.txt";
        //System.out.println(s.substring(s.length()-4, s.length()));
    }
    //public static class UnsupportedFileNameException extends Exception {
//
//    }
}

