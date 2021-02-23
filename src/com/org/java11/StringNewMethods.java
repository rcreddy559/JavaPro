package com.org.java11;

import lombok.NonNull;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringNewMethods {
    public static void main(String[] args) throws IOException {
//        newMethodsDemo();
//        List<String> lines = stringNewLines();
//        removeWhiteSpaces();
//          repeatString();
//        fileReadWrite();
//        newMethodsDemo();
    	
//    	Author a = new Author("Ravi", "test");
//    	System.out.println(a.firstname());
//    	System.out.println(a.toString());

//        indentTest();
        transformDemo();
    	String name = "test";
//    	describeConstableDemo(null);
    }
    
    private static void describeConstableDemo(String name) {
    	
		Optional<String> os =  Optional.ofNullable(name);
		System.out.println(os);

        os.ifPresent(System.out::println);
		

    }
    private static void transformDemo() {
    	String firstName = "ravi";
    	String secondName = "test";
    	
    	final String n = firstName.resolveConstantDesc(MethodHandles.lookup());
    	String name = firstName.transform(f -> f + secondName);
    	

    	String s = "Hi,Hello,Howdy";
    	List strList = s.transform(s1 ->  Arrays.asList(s1.split(",")));
    	String[] strArr = s.transform(s1 ->  s1.split(","));
    	System.out.println(Arrays.toString(strArr));

    	Stream.of(strArr).forEach(System.out::println);
    	
    	String s123 = "Hi-Hello-Howdy";
    	List strList2 = s123.transform(s1 -> Arrays.asList(s1.split("-")));

    	Stream.of(strList2).forEach(System.out::println);
		
	}
	private static void indentTest() {
        String str = "*****\n  Hi\n  \tHello Pankaj\rHow are you?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));
    }

    private static void fileReadWrite() throws IOException {
        Path filePath = Files.writeString(Files.createTempFile("myTemp", ".txt"),
                "this is content of myTemp txt file");
        System.out.println(filePath);

        String text = Files.readString(filePath);
        System.out.println(text);
    }

    private static void fileReadWriteLines() throws IOException {

        Set<String> set = Set.of("one", "two", "three", "four", "file");
        Path filePath = Files.write(Files.createTempFile("myTemp", ".txt"),
                set);
        System.out.println(filePath);

        String text = Files.readString(filePath);
        System.out.println(text);
    }

    private static void repeatString() {
        String name = "Name123";
        String rep = name.repeat(20);
        System.out.println(rep);
    }

    private static void removeWhiteSpaces() {
        String name = "  123 Name 909 \u2000 ";

        System.out.printf("-->%s<---\n",name.trim());
        System.out.printf("-->%s<---\n",name.strip());
        System.out.printf("-->%s<---\n",name.stripLeading());
        System.out.printf("-->%s<---\n",name.stripTrailing());

        System.out.println(name.trim().equals(name.strip()));
        System.out.println(name.trim() == name.strip());
    }


    private static List<String> stringNewLines() {
        final String strLine = "one\ntwo\nthree\nfour\n2020202\ntrue\nrun 1 2 3";
        System.out.printf("lines string is :%s\n", strLine);
        Stream<String> lines = strLine.lines();

//        lines.forEach(System.out::println);
//        List<String> ls = lines.collect(Collectors.toList());
//        Set<String> l22s = lines.collect(Collectors.toSet());

        List<String> collect = lines.map((@NonNull var s) -> {
            System.out.println(s);
            s += "*";
            return s;
        }).collect(Collectors.toList());

        for(String s: collect) {
            System.out.println(s);
        }
//        System.out.println(ls.hashCode());
        return null;

    }

    private static void newMethodsDemo() {
        String empty = " ";
        String blank = "";
        String name = "my name";

        System.out.printf("Is empty check : %b, %b\n", empty.isEmpty(), empty.isBlank());
        System.out.printf("Is blank check : %b, %b\n", blank.isEmpty(), blank.isBlank());
        System.out.printf("Is name  check : %b, %b\n", name.isEmpty(), name.isBlank());
    }
}
//
//record Author(String name, String firstname) {
//	static String value;
//}
