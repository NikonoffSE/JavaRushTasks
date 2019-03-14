package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int l = 0;
        int c = 0;
        int r = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1 ) {
                    if (i==0&&j==0) l++;
                    else{
                        if (i==0 || j==0) {
                            if (i == 0 && a[i][j - 1] == 0) l++;
                            if (j == 0 && a[i - 1][j] == 0) l++;
                        }
                        else {
                            if (a[i - 1][j - 1] == 0 && a[i ][j - 1] == 0 && a[i - 1][j] == 0) l++;
                        }
                        //if (i==a.length-1 && j==a[i].length-1) r++;
                        //else    {
//                            if (i==a.length-1 && a[i][j+1]==0) r++;
//                            if (j==a[i].length-1 && a[i+1][j]==0) r++;
//                        }
                    }

                }


                    /*//c++;
                    //System.out.println(i + " " + j);
                    while (i < a.length - 1 && j < a[i].length - 1) {
                        if (a[i + 1][j] == 1) {
                            i++;
                            n = i + 1;
                        }

                        if (a[i][j + 1] == 1) {
                            m = i + 1;
                            j++;
                        }
                        if (i >= a.length - 1 || j >= a[i].length - 1){
                            c++;
                            break;
                        }
                        if (a[i + 1][j] == 0 && a[i][j + 1] == 0) {
                           // n = i + 1;
                            //m = i + 1;
                            c++;
                            break;
                        }
                    }
                }*/

            }
        }

        return l;
    }
}
