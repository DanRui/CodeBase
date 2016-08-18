package com.dr;

public class TestSuperAndThis {

	/**
	 * @Title: main
	 * @Description: TODO(测试super和this的作用)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new B("灰太狼", 3));
		//如果父类构造器调用了被子类重写的方法，且通过子类构造器来创建子类对象，调用了父类构造器，就会导致子类的重写方法在子类构造器的
		//所有代码之前执行，从而导致子类的重写方法访问不到子类的实例变量值的情形。
	}

}

class A {
	
	private String desc;
	public A() {
		this.desc = getDesc();
	}
	
	public String getDesc() {
		return "A";
	}
	
	public String toString() {
		return desc;
	}
}

class B extends A {
	
	private String name;
	private double weight;
	
	public B(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String getDesc() {
		return "B[name=" + name + ", weight=" + weight + "]";
	}
}