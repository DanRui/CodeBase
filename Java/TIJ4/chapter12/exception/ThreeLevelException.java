class BaseException extends Exception {}

class A extends BaseException {}

class C extends A {}

class Animal {
	public void f() throws BaseException {
		throw new BaseException();
	}
}

class Dog extends Animal {
	public void f() throws A {
		throw new A();
	}
}

class Wolf extends Dog {
	public void f() throws C {
		throw new C();
	}
}

public class ThreeLevelException {
	public static void main(String[] args) {
		Animal a = new Wolf();
		try {
			a.f();
		} catch (BaseException e) {
			System.out.println(e);
		}
	}
}