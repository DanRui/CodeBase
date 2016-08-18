public class Calculator {
	public static void main(String[] args) {
		String  exp = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack<String> stack = new Stack<String>();
		for(int i = 0 ; i < exp.length() ; i ++) {
			char c = exp.charAt(i);
			if ('+' == c) {
				i ++;
				if ('+' != exp.charAt(i)) {
					stack.push(exp.charAt(i)+"");
				} else if ('-' == exp.charAt(i)) {
					System.out.println(stack.pop());
				} else {
					i ++;
				}
			} else if ('-' == c){
				System.out.println(stack.pop());
			}
		}
		System.out.println(stack);
	}
}