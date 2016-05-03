package chap01.module1;

/**
 * Sub classes will call super class constructor implicitly
 * 
 */
public class SuperSubClass extends SuperClass {

	public SuperSubClass() {
		System.out.println("SubClass Default Constructor");
	}

	public SuperSubClass(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		SuperSubClass ssc = new SuperSubClass();
		SuperSubClass ssc1 = new SuperSubClass("SubClass Args Constructor");
		System.out.println(ssc.doSuper());
	}
}
