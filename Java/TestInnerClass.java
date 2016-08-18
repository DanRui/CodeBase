class A {
	class B {
		private int a = 10;
		public void f() {
			System.out.println("inner class: " + a);
		}
	}
	public void outer() {
		System.out.println("outer class");
		B b = new B();
		// b.f();
		b.a = 2;//外部类可以访问内部类的私有变量。
		b.f();
	}
}

public class TestInnerClass {
	public static void main(String[] args) {
		new A().outer();
	}
}