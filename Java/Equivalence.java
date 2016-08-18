public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		System.out.println(n1 == n2);//==永远比较的是两个地址
		System.out.println(n1.equals(n2));//equals比较对象的值，默认是比较引用，如果需要比较值则要重写。
	}
}