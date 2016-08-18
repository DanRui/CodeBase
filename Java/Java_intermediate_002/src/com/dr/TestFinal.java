package com.dr;

public class TestFinal {

	final int a = 2;
	
	static {
		b = 0;
	}
	
	static final int b;
	
	/**
	 * @Title: main
	 * @Description: TODO(测试final关键字作用)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.final实例变量必须要显示地初始化，实例变量则不需要。其初始化的方式跟实例变量初始化一样，只是在初始化之后不允许再修改了。
		TestFinal t = new TestFinal();
		System.out.println(t.a);
		//2.对于final类变量也必须要显示地初始化。可以在定义的时候，也可以在静态初始化块中进行。
		System.out.println(TestFinal.b);
		//3.不论是final修饰的实例变量还是类变量都会把该变量的值设定为“宏变量”，该变量在初始化的时候编译器会把该初始值确定下来。
		//4.如果初始化赋值的表达式是基本的算术表达式或者是字符串连接运算，没有访问普通变量，调用方法，编译器还是会把这种final变量
		//当做“宏变量”来处理。
		final String a;
		{
			a = "Java";
		}
			
		final String b = "Farewell";
		String c = "Java" + "Farewell";
		String d = a + b;
		System.out.println("JavaFarewell" == c);
		System.out.println(c == d);
		//5.只有在定义的时候对final实例变量或类变量执行初始化，系统才会对改变量执行“宏替换”，其它情况无论是实例变量在初始化块中还是在构造器中初始化，
		//还是类变量在静态初始化块中初始化都不会执行“宏替换”。
		//6.final修饰的方法不能被子类重写，但是可以在子类中定义跟父类相同的方法。
		//7.final修饰的类无法被继承。
	}

}
