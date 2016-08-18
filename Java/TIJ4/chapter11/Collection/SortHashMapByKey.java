import java.util.*;

public class SortHashMapByKey {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random random = new Random(46);
		for (int i = 0 ; i < 10000 ; i ++) {
			int r = random.nextInt(20);
			Integer value =  map.get(r);
			map.put(r, (value == null) ? 0 : value + 1);
		}
		System.out.println(map);
		Set<Integer> set = new TreeSet<Integer>(map.keySet());
		System.out.println(set);
	}
}