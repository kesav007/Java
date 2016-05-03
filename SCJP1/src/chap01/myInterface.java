package chap01;

import java.io.IOException;

/**
 * All methods are public abstract by default All variables are public static
 * final in any order
 */
public interface myInterface {
	static final public int MAX = 10;
	final static public int MIN = 10;
	final static public int AVG = 10;
	public static final int SUM = 91;

	public abstract void method1();

	abstract public void method2() throws IOException;

//	public abstract int method1();
}
