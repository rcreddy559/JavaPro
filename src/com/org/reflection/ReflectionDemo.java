package com.org.reflection;

import java.lang.reflect.Field;

import com.org.utils.Person;

public class ReflectionDemo {

	public static void main(String[] args) {
		Person person = new Person("ravi", "change", 50, "Male", "");

		System.out.println(person.toString());

		try {
			Field field = person.getClass().getDeclaredField("firstName");
			System.out.println(field.get(person));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
