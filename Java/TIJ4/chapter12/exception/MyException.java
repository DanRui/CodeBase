class SimpleException extends Exception {
	public SimpleException() {}
	public SimpleException(String msg) { super(msg); }
}

public class MyException {

	public static void f() throws SimpleException {
		System.out.println("Throwing SimpleException from f()");
		throw new SimpleException();
	}

	public static void g() throws SimpleException {
		System.out.println("Throwing SimpleException from g()");
		throw new SimpleException("Originated in g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (SimpleException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (SimpleException e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("It has executed.");
		}
	}
}