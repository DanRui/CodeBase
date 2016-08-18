package com.dr;

public class TestArray {

	/**
	 * @Title: main
	 * @Description: TODO(测试数组的初始化)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// 1.初始化数组的两种方式。静态初始化数组，指定每个数组元素的值，例如
		// char[] s = new char[] {'a', 'b', 'c'}
		// 动态初始化数组，只指定数组长度，系统会为每个元素分配初始值，整型默认为0，浮点数默认为0.0，
		// 布尔类型默认为false，char类型默认为'\u0000'，引用类型默认为null。
		// 2.数组是静态的是指数组变量指向的数组对象是静态的，而数组变量本身是引用。一旦数组的长度确定就不能修改了，但我们可以修改数组中元素的值。
		char[] alphabet = new char[3];
		for (int i = 0 ; i < alphabet.length ; i ++) {
			System.out.println(alphabet[i]);
		}

	}

}
