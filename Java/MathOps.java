import java.util.*;
public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i, j, k;
		j = rand.nextInt(100) + 1;
		System.out.println("j : " + j);
		k = rand.nextInt(100) + 1;
		System.out.println("k : " + k);
		i = j + k;
		System.out.println("j + k : " + i);
		i = j - k;
		System.out.println("j - k : " + i);
		i = j * k;
		System.out.println("j * k : " + i);
		i = j / k;
		System.out.println("j / k : " + i);
		i = j % k;
		System.out.println("j % k : " + i);
		char u = 'a', v = 'b', w = 'c';
		u += v;//可以组合运算赋值，但是不能单独计算直接赋值，因为会进行int-->char的转换。
		//float、double类型不能进行取余运算。
		System.out.println("u += v : " + u);

	}
}