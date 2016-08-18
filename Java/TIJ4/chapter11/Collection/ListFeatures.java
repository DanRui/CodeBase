import java.util.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random random =  new Random(47);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("1:" + list);
		list.add(6);
		System.out.println("2:" + list);
		System.out.println("3:" + list.contains(4));
		list.remove(2);
		System.out.println("4:" + list);
		int i = list.get(2);
		System.out.println("5:" + list.indexOf(i));
		List<Integer> sub = list.subList(1,3);
		System.out.println("6:" + sub);
		System.out.println("7:" + list.containsAll(sub));
		Collections.sort(sub);
		System.out.println("8:" + sub);
		Collections.shuffle(sub, random);
		System.out.println("9:" + sub);
		List<Integer> copy = new ArrayList<Integer>(list);
		sub = Arrays.asList(list.get(1), list.get(4));
		System.out.println("10:" + sub);
		copy.retainAll(sub);
		System.out.println("11:" + copy);
		list.removeAll(sub);
		System.out.println("12:" + list);
		list.set(1,8);
		System.out.println("13:" + list);
		list.addAll(2, sub);
		System.out.println("14:" + list);
		list.clear();
		System.out.println("15:" + list);
		System.out.println("16:" + list.isEmpty());
		Object[] o = sub.toArray();
		System.out.println("17:" + o[1]);
		Integer[] j = copy.toArray(new Integer[0]);
		System.out.println("18:" + j[1]);
	}
}