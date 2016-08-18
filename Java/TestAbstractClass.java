
abstract class Animal {
	public abstract void f();

}

class Dog extends Animal {
	public void f() {
		System.out.println("Dog bite");
	}

	static void info(Animal m) {
		m.f();
	}
}

public class TestAbstractClass {
	public static void main(String[] args) {
		Dog.info(new Dog());
	}
}