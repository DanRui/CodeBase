class A {
	private final void info() {
		System.out.println("base method call");
	}
}

public class B extends A {
	private final void info() {
		System.out.println("derived method call");
	}

	public static void main(String[] args) {
		B b = new B();
		b.info();
		A a = b;
		//a.info();//并没有重写info方法，因为final修饰。
	}
}