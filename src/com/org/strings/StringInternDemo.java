package com.org.strings;

public class StringInternDemo {

        public static void main(String[] args) {
                demo();
        }
	 static void demo() {
        String s1 = "Test";
        String s2 = "Test";
        String s3 = "Test";
        final String s4 = s3.intern();
        System.out.println("s1 == s2 :"+(s1 == s2));
        System.out.println("s2 == s3 :"+(s2 == s3));
        System.out.println("s3 == s4 :"+(s3 == s4));
        System.out.println("s1 == s3 :"+(s1 == s3));
        System.out.println("s1 == s4 :"+(s1 == s4));
        System.out.println("s1.equals(s2) :"+(s1.equals(s2)));
        System.out.println("s2.equals(s3) :"+(s2.equals(s3)));
        System.out.println("s3.equals(s4) :"+(s3.equals(s4)));
        System.out.println("s1.equals(s4) :"+(s1.equals(s4)));
        System.out.println("s1.equals(s3) :"+(s1.equals(s3)));
    }

}
