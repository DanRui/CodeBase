import java.util.*;

public class RandomDoubles {
	private static Random rand = new Random(47);
	public double next() {
		return rand.nextDouble();
	}
	public static void main(String[] args) {
		RandomDoubles r = new RandomDoubles();
		for (int i = 0 ; i < 7 ; i ++) {
			System.out.println(r.next());
		}
	}
}