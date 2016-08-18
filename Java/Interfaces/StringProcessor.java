import java.util.*;

public	abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);

	public static String s = "I am happy that you are coding.";

	//虽然是抽象类，但是编译运行时可以运行静态main方法。
	public static void main(String[] args) {
		//new StringProcessor();//抽象类无法实例化
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}