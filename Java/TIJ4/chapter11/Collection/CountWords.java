import java.util.*;

public class CountWords {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String s =  "I am coding. so don't disturb me. thanks, you are so nice.";
		Collections.addAll(list, s.split("[\\s\\.\\,]+"));
		System.out.println(list);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : list) {
			Integer value = map.get(str);
			int count = (value == null) ? 0 : value;
			map.put(str, ++count);
		}
		System.out.println(map);
	}
}