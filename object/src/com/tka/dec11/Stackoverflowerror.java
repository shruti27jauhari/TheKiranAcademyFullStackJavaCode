package com.tka.dec11;

public class Stackoverflowerror {
void m1() {
 System.out.println("m1 method");
 Stackoverflowerror s1=new Stackoverflowerror();
 s1.m2();
 
}

void m2() {
	 System.out.println("m1 method");
	 Stackoverflowerror s1=new Stackoverflowerror();
	 s1.m1();
}
}
