package model;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		Field[] field = model.Student.class.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {

			System.out.println(field[i]);
		}
	}

}
