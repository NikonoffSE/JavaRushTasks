package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> lw = new ArrayList<>();
        lw = detectAllWords(crossword, "home", "same", "fderlk");
        if (lw.size() > 0) {
            for (Word w : lw) {
                System.out.println(w.toString());
            }
        } else System.out.println("нет совпадений");

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        int startX;
        int startY;
        int endX;
        int endY;
        Word word;
        List<Word> lw = new ArrayList<>();
        for (String w : words) {
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    if (w.getBytes()[0] == crossword[i][j]) {
                     //   System.out.println((char) w.getBytes()[0]);
                        if (i + w.length() <= crossword.length) {
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i + k][j]) {
                                   // System.out.println(w.getBytes()[k] + " " + crossword[i + k][j]);
                                    if (k == w.length() - 1) {
                                        endX = j;
                                        endY = i + k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                        if (i - (w.length()-1) >= 0) {
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i - k][j]) {
                                 //   System.out.println(w.getBytes()[k] + " " + crossword[i - k][j]);
                                    if (k == w.length() - 1) {
                                        endX = j;
                                        endY = i - k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                        if (j + w.length() <= crossword[i].length) {
                        //    System.out.println("Зашли");
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i][j + k]) {
                              //      System.out.println(w.getBytes()[k] + " " + crossword[i][j + k]);
                                    if (k == w.length() - 1) {
                                        endX = j + k;
                                        endY = i;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                        if (j - (w.length()-1) >= 0) {
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i][j - k]) {
                               //     System.out.println(w.getBytes()[k] + " " + crossword[i][j - k]);
                                    if (k == w.length() - 1) {
                                        endX = j - k;
                                        endY = i;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                       // if ((char) w.getBytes()[0] == 'h') {
                      //      System.out.println((i + w.length() < crossword.length) && ((j + w.length()) <= crossword[i].length));
                      //      System.out.println( (i + w.length()) + " " +  crossword.length + " " + (j + w.length()) + " " +crossword[i].length);
                    //    }
                        if ((i + w.length() <= crossword.length) && (j + w.length() <= crossword[i].length)) {
                          //  System.out.println("Зашли");
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i + k][j + k]) {
                                //    System.out.println(w.getBytes()[k] + " " + crossword[i + k][j + k]);
                                    if (k == w.length() - 1) {
                                        endX = j + k;
                                        endY = i + k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                        if ((i - (w.length()-1) >= 0) && (j + w.length() <= crossword[i].length)) {
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i - k][j + k]) {
                             //       System.out.println(w.getBytes()[k] + " " + crossword[i - k][j + k]);
                                    if (k == w.length() - 1) {
                                        endX = j + k;
                                        endY = i - k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }
                        if ((i + w.length() <= crossword.length) && (j - (w.length()-1) >= 0)) {
                          //  System.out.println("Зашли");
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i + k][j - k]) {
                                //    System.out.println(w.getBytes()[k] + " " + crossword[i + k][j - k]);
                                    if (k == w.length() - 1) {
                                        endX = j - k;
                                        endY = i + k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }

                        if ((i - (w.length()-1) >= 0) && (j - (w.length()-1) >= 0)) {
                          //  System.out.println("Зашли");
                            startX = j;
                            startY = i;
                            for (int k = 1; k < w.length(); k++) {
                                if (w.getBytes()[k] == crossword[i - k][j - k]) {
                                //    System.out.println(w.getBytes()[k] + " " + crossword[i - k][j - k]);
                                    if (k == w.length() - 1) {
                                        endX = j - k;
                                        endY = i - k;
                                        word = new Word(w);
                                        word.setStartPoint(startX, startY);
                                        word.setEndPoint(endX, endY);
                                        lw.add(word);
                                    }
                                } else break;
                            }
                        }


                    }

                }

            }
        }
        return lw;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
