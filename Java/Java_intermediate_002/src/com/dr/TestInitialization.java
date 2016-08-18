package com.dr;

class Base {
	
	private int i = 2;
	
	public Base() {
		System.out.println(this.i);//此时this的编译类型是Base，所以输出2
		this.display();//此时this代表的是正在初始化的Java对象
		System.out.println(this.getClass());
		//this的编译类型是Base,无法调用子类的方法。
		//this.sub();
		//当变量的编译时类型和运行时类型不同时，通过该变量访问它引用的实例变量时，该实例变量的值由声明该变量的类型决定。
		//但通过该变量调用它所引用的实例方法时，该方法的行为由它实际引用的对象来决定。
		
	}
	
	public void display() {
		System.out.println(i);
	}
	
}

class Derived extends Base{
	
	private int i = 22;
	
	public Derived() {
		i = 222;
	}

	public void display() {
		System.out.println(i);
	}
	
	public void sub() {
		
	}
}

public class TestInitialization {
	
	int num = num2 + 1;//实例变量，定义时初始化
	static int num2;//类变量，初始化在实例变量之前，所以不论其的顺序。
	//非静态代码块中进行赋值
	{
		num = 3;
	}
	//静态代码块中初始化
	static {
		name = "Hello,Java.";
	}
	//类变量，定义时初始化
	static String name = "Initialize...";
	public TestInitialization() {
		System.out.println(num);
	}
	
	/**
	 * @Title: main
	 * @Description: TODO(测试Java类的初始化、类的实例变量的初始化、类变量的初始化等。)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derived();//输出0，调用Derived的构造方法时，隐式调用Base的无参构造方法

		//实例变量的初始化
		//1.定义实例变量时指定初始值；
		//2.非静态初始化块中对实例变量指定初始值；
		//3.构造器中对实例变量指定初始值。
		//以上第1、2两种方式比第三种方式更早执行，但是1、2两种方式的执行顺序与它们在源代码中的顺序相同。
		//以上三种给实例变量指定初始值的方式的作用是类似的。在经过编译器的处理后，它们赋值的语句被合并到构造器中。
		//定义时赋值的语句、初始化块中的赋值语句总是位于构造器的语句之前，并且这两种语句的顺序与它们在源程序中的顺序一致。
		
		new TestInitialization();
		
		//类变量的初始化
		//类变量属于类本身，为所有实例共享。所以类变量的初始化在JVM对类进行分配内存空间时进行。
		//类变量只初始化一次。
		//1.定义变量时初始化；
		//2.静态初始化块中指定初始值。两种方式的执行顺序与它们在源代码中的顺序一致。
		
		System.out.println(TestInitialization.name);
		
		

	}

}