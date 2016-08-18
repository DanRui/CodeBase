import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Object> obj_queue = new PriorityQueue<Object>();
		Random rand = new Random(47);
		for (int i = 0 ; i < 10 ; i ++) {
			queue.offer(rand.nextInt(i + 10));
			obj_queue.offer(new Object());// 无法将Object对象加入优先队列中，因为其没有实现Comparable接口。
		}
		QueueDemo.printQ(queue);
		QueueDemo.printQ(obj_queue);
	}
}