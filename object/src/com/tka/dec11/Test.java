package com.tka.dec11;

public class Test {
	public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1);
        s1.roll = 101;
        s1.name = "Jay";
        s1.marks = 95;

        s1.displayDetails();

        System.out.println("--------------------");

        Student s2 = new Student();
        System.out.println(s2);
        s2.roll = 102;
        s2.name = "Viru";
        s2.marks = 85;

        s2.displayDetails();
    }
}
