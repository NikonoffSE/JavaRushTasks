package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //C:/Temp/my.properties
        String fname = br.readLine();
        br.close();
        load(new FileInputStream(fname));
        save(new FileOutputStream(fname));
        //properties.put("Name", "Sergey");
        //properties.put("age", "12");//implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties p=new Properties();
        for (Map.Entry<String, String> e: properties.entrySet()) {
            p.setProperty(e.getKey(),e.getValue());
        }
        p.store(outputStream,null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties p = new Properties();
        p.load(inputStream);

        for (String s:p.stringPropertyNames()) {
            properties.put(s,p.getProperty(s));
        }
    }

    public static void main(String[] args) throws Exception{
        Solution s = new Solution();
        s.fillInPropertiesMap();
      //  for (Map.Entry<String, String> e: s.properties.entrySet()) {
        //    System.out.println(e.getKey() + "=" + e.getValue());
       // }
    }
}
