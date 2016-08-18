package com.dr;

public class TestDefaultClass {

	public static void main(String[] args) {
		Animal a = new Animal();//没有引入，可以访问，说明在一个包内，可以访问default的类。
		a.setLegs(2);
		System.out.println(a.getLegs());
	}
	
}
