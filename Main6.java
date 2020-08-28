package ru.geekbrains.j_one.lesson_a.online;

public class Main6 {
    import java.io.*;
import java.util.Scanner;



        private static void text1() throws IOException {
            throw new IOException("Java — строго типизированный объектно-ориентированный язык программирования ");
        }

        private static void text2() {
            try {
                throw new IOException(" На 2019 год Java — один из самых популярных языков программирования.");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        public static void main(String[] args) {
      try {
          text1();
      } catch (IOException exception) {
          exception.printStackTrace();        }
        text2();
            InputStream in;
            OutputStream out;
}
