package test;

import student.StudentInfor;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		StudentInfor st = new StudentInfor("Nghia", 21);
		System.out.println("My name is "+st.getName());
		System.out.println("I am "+st.getAge());
	}
}
