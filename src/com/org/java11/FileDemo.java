package com.org.java11;

import java.io.IOException;
import java.nio.file.Files;
import static java.lang.System.out;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        var path = Files.writeString(
                Files.createTempFile("input",
                                     ".txt"),
                                       "    Path path = Files.writeString(   \n       Files.createTempFile");
        out.println("Path:" + path);
        var s = Files.readString(path);
        s.lines().forEach(System.out::println);
        out.println("--------- with strip------");
        s.lines().map(s2->s2.repeat(2)).map(String::strip).forEach(System.out::println);
    }
}
