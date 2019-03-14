package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface ti;
       public void setModel(List rows){
           System.out.println(rows.size());
           ti.setModel(rows);
       }
       public String getHeaderText(){
       return ti.getHeaderText().toUpperCase();
       }

       public void setHeaderText(String newHeaderText){
          ti.setHeaderText(newHeaderText);
       }

        public TableInterfaceWrapper(TableInterface t) {
          ti=t;
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}