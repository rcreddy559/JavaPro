package com.org.java9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("MyFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("MyFile.txt");

        try(fileInputStream; fileOutputStream) {
            System.out.println("test ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
