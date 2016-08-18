package com.polymorphism;

public class TestAbstract {

	/**
	 * @Title: main
	 * @Description: TODO(测试abstract关键字)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat(3);
		cat.age();

	}

}

abstract class Animal {
	abstract public void age();
}

class Cat extends Animal {
	int age;
	
	public Cat(int age) {
		this.age = age;
	}
	
	public void age() {
		System.out.printf("这只猫%d岁了！",this.age);
	}
}