import java.util.logging.*;
import java.io.*;

public class TestLoggingException extends Exception{
	private static Logger logger = Logger.getLogger("TestLoggingException");

	public TestLoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		try {
			throw new TestLoggingException();
		} catch (TestLoggingException e) {
			System.err.println(e);
		}
	}
}