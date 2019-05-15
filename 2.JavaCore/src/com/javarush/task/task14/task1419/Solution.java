package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);//ArithmeticE
        }
        try {
            int[] arr = new int[0];
            arr[0] = 1;
        }
        catch (Exception e){
            exceptions.add(e);
            //ArrayIndexOutOfBound
        }
        try {
            int[] arr = new int[1];
            arr[0] = Integer.parseInt("a");
        }
        catch (Exception e){
            exceptions.add(e);
            // NumberFormatException
        }
        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }
        catch (Exception e){
            exceptions.add(e);//ArrayStoreException
        }
        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        }
        catch (Exception e){
            exceptions.add(e);//ClassCastException
        }
        try {
            int[] nNegArray = new int[-5];
        }
        catch (Exception e){
            exceptions.add(e);//NegativeArraySizeException
        }
        try {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;
        }
        catch (Exception e){
            exceptions.add(e);//NullPointerException
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ccc"));//InputStreamReader(System.in));
            String s = null;
            int x;
           s = reader.readLine();
        }
        catch (Exception e){
            exceptions.add(e);//FileNotFoundException   IOException
        }
        try {
            throw new IllegalArgumentException(";jgf");
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch (Exception e){
            exceptions.add(e);//StringIndexOutOfBoundsException
        }
        //int result = 0;
        //String s;
        //result = Integer.rotateLeft(-1,);




        //напишите тут ваш код

    }
}
