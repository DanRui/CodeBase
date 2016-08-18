import java.util.*;
public class Bool {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println(i);
		System.out.println(j);
		System.out.println(i > j);
		System.out.println(i <= j);
		//System.out.println(i && j);//不允许将int进行布尔类型来操作
	}
}