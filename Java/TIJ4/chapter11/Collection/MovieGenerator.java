import java.util.*;

public class MovieGenerator {
	private List<String> movie = new ArrayList<String>();
	private int next = 0;
	public void add(String s) {
		movie.add(s);
	}
	public String next() {
		if (next == movie.size()) {
			next = 0;
		}
		return movie.get(next++);
	}
	public static Collection fill(Collection c, MovieGenerator mv) {
		for (int i = 0 ; i < 3 ; i ++) {
			c.add(mv.next());			
		}
		return c;
	}
	public static void main(String[] args) {
		MovieGenerator mv = new MovieGenerator();
		mv.add("Snow");
		mv.add("White");
		mv.add("Star Wars");
		System.out.println(fill(new ArrayList<String>(), mv));
		System.out.println(fill(new LinkedList<String>(), mv));
		System.out.println(fill(new HashSet<String>(), mv));
		System.out.println(fill(new LinkedHashSet<String>(), mv));
		System.out.println(fill(new TreeSet<String>(), mv));
	}
}