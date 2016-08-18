package com.polymorphism;

public class TestPolymorphism extends Person{
	
	@Override
	public void sleep() {
		System.out.println("I can't sleep well recently.");
	}

	/**
	 * @Title: main
	 * @Description: TODO(测试多态)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new TestPolymorphism();
		p.sleep();

	}

}

class Person {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void sleep() {
		System.out.println(this.name + " is sleeping!");
	}
}