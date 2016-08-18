import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught" + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught" + e);
		}
		try {
			int[] a = new int[10];
			a[10] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
	}
}