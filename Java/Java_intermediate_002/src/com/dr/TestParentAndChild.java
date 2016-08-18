package com.dr;

public class TestParentAndChild {

	/**
	 * @Title: main
	 * @Description: TODO(测试父类构造器、子类构造器初始化Java对象)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wolf(4.8);
		//程序在创建Java对象时，总是先调用最顶层父类的初始化操作，包括初始化块和构造器，然后依次调用所有父类的初始化操作
		//最后调用本类的初始化操作返回本类实例。
		//super用于显示调用父类的构造器，this用于显示调用本类另外一个重载的构造器。super和this调用只能在构造器中使用，且必须作为构造器的
		//第一行代码。super和this调用最多只能使用其一，并且只能使用一次。
	}

}

class Creature {
	
	{
		System.out.println("Creature的非静态初始化块！");
	}
	
	//无参构造器
	public Creature() {
		System.out.println("Creature的无参构造器！");
	}
	
	//有一个参数的构造器
	public Creature(String name) {
		this();
		System.out.println("Creature带有name参数的构造器，name参数：" + name);
	}
}

class Animal extends Creature{
	
	{
		System.out.println("Animal的非静态初始化块！");
	}
	
	//带一个参数的构造器
	public Animal(String name) {
		super(name);
		System.out.println("Animal带有name参数的构造器，name参数：" + name);
	}
	
	//带两个参数的构造器
	public Animal(String name, int age) {
		this(name);//调用另外一个重载的构造器
		System.out.println("Animal带2个参数的构造器，其中age:" + age);
	}
}

class Wolf extends Animal {
	
	{
		System.out.println("Wolf的非静态初始化块！");
	}
	
	//无参数构造器
	public Wolf() {
		//显示调用父类的带2个参数的构造器
		super("灰太狼", 3);
		System.out.println("Wolf无参数构造器！");
	}
	
	public Wolf(double weight) {
		this();
		System.out.println("Wolf的带参数的构造器，weight:" + weight);
	}
}