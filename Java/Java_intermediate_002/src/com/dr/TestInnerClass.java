package com.dr;

/*
 * 1.内部类的几种表现方式。成员内部类、局部内部类、匿名内部类和静态内部类。
 * 作为外部类成员的形式定义在外部类中。成员内部类无法定义静态成员。
 */

public class TestInnerClass {
	
	private String name = "Hello";
	private static String x = "as";
	
	public void outerDisplay() {
		System.out.println("name is :" + name);
	}
	
	/*
	class InnerClass {
		//无法定义静态成员，包括变量和方法
		//static private String innerName = "World";
		private String inner_name = "World";
		
		public void innerDisplay() {
			System.out.println("outer name is :" + name);
			System.out.println("inner name is :"+ inner_name);
		}
		
		public TestInnerClass getOuterClass() {
			return TestInnerClass.this;
		}
		
	} 
	*/
	
	/**
	 * 2.局部内部类。定义在方法中或者在作用块内的类。下例子是定义在方法中，也可以定义在作用域内部。
	 * 局部类中定义的变量无法在作用域外被访问。
	 * 
	 */
	/*
	public LocalInterface getLocalClass(String str) {
		class LocalClass implements LocalInterface{
			private String label;
			public LocalClass(String str) {
				label = str;
			}
			@Override
			public String display(String str) {
				return str;
			}
		}
		return new LocalClass(str);
	}
	*/
	
	/**
	 * 3.匿名内部类。顾名思义匿名内部类没有类名，所以它没有构造方法，在其内部使用局部变量必须定义为final的。
	 * 匿名内部类没有访问修饰符，并且返回的接口一定要存在，否则编译报错。
	 */
	/*
	public LocalInterface getInnerClass(final int num, String str) {
		return new LocalInterface() {
			int number = num + 3;

			@Override
			public int getNumber() {
				return number;
			}
		};
	}
	*/
	
	/**
	 * 4.静态内部类。使用static修饰，也可使用public protected private修饰，无法访问外部类的非静态成员，包括变量和方法。
	 * 无法通过静态内部类名.this获取外部类的引用，也不依靠外部类的实例来创建对象。
	 */
	static class InnerClass {
		public String inner_name = "Good";
		private static String sex = "male";
		
		public void display() {
			System.out.println("name is :" + x);
			System.out.println("inner_name is :" + inner_name + ", sex is :" + sex);
		}
	}
	
	public void display() {
		//System.out.println(InnerClass.inner_name);//无法直接访问静态内部类的非静态变量，可以通过类名访问静态变量
		System.out.println(InnerClass.sex);
		new InnerClass().display();
	}
	
	public static void main(String[] args) {
		TestInnerClass t = new TestInnerClass();
		t.outerDisplay();
		t.display();
		//LocalInterface in = t.getInnerClass(3, "Java");
		//System.out.println(in.getNumber());
		//LocalInterface l = t.getLocalClass("Java");
		//System.out.println(t.label);//无法访问
		//TestInnerClass.InnerClass inner = t.new InnerClass();//需要外部类对象来实例化
		//inner.innerDisplay();
		//System.out.println(inner.getOuterClass() == t);//内部类的实例获得了指向其外部类的引用，即为OuterClassName.this
		
		
	}

}

interface LocalInterface {
	//String display(String str);
	int getNumber();
}
