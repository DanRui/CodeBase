package com.interfaces;

public class TestInterface implements A{

	/**
	 * @Title: main
	 * @Description: TODO(测试接口的运用)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new TestInterface();
		a.f();

	}

	@Override
	public void f() {
		System.out.println(a);
	}
	
}

interface A {
	int a = 1;
	void f();
}