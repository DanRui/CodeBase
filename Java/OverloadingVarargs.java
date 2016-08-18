public class OverloadingVarargs {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(Character... args) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');//因为‘a'会自动转换成float来匹配方法。
	}

}