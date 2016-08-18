public class Precedence {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;//先乘除后加减
		int b = x + (y - 2) / (2 + z);//括号改变优先级
		System.out.println("a = " + a + ", b = " + b);
	}
}