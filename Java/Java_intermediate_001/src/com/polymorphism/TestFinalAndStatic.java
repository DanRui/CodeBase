package com.polymorphism;

public final class TestFinalAndStatic {
	
	private final String name = "邓瑞";

	public final void print() {
		System.out.println("You can't override it.");
	}
	
	public static void test() {
		System.out.println("I can be invoked without the TestFinalAndStatic objects.");
	}
	/**
	 * @Title: main
	 * @Description: TODO(测试关键字final、static)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinalAndStatic t = new TestFinalAndStatic();
		//t.name = "a";//常量无法被修改
		System.out.println(t.name);
		TestFinalAndStatic.test();
	}

}

/*class Inherited extends TestFinalAndStatic {
	无法继承该类
//	@Override
	public void print() {
		无法重写方法
	}
}*/