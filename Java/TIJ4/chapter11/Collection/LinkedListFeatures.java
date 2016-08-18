import java.util.*;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.element());
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		System.out.println(linkedList.remove());
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		linkedList.addFirst(6);
		System.out.println(linkedList);
		System.out.println(linkedList.add(7));
		System.out.println(linkedList.offer(8));
		linkedList.addLast(9);
		System.out.println(linkedList);
		System.out.println(linkedList.removeLast());
	}
}