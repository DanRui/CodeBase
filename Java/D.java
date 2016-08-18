interface C {
	void f();
}

public class D {
	private class E implements C {
		public void f() {
			System.out.println("E call");
		}
		public void info() {
			System.out.println("info call");
		}
	}
	public C p() {
		return new E();
	}
	public static void main(String[] args) {
		D d = new D();
		C c = d.p();
		((E)c).info();
	}
}