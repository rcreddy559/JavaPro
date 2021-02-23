package com.org.java11;

public class SwitchExpressions {
    public static void main(String[] args) {
//        String day = "M";
//        String result = switch (day) {
//            case "M", "W", "F" -> "MWF";
//            case "T", "TH", "S" -> "TTS";
//            default -> {
//                if(day.isEmpty()) {
//                    yield "Please insert a valid day.";
//                } else {
//                    yield "Looks like a Sunday.";
//                }
//            }
//
//        };
//        System.out.println(result);
    }
}

class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student student) {
            return student.name.equals(this.name);
        }
        return false;


    }


}
