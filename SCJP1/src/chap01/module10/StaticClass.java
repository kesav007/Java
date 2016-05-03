package chap01.module10;

/**
 * Static Rules
 * 1. Static can be applied to only Methods, Variables, InnerClasses, Initaliztion Blocks
 * 2. They cannot be applied to the following
 * 3. classes, constructors, interfaces, 
 * 4. method and variables in inner class
 * 5. Local Variables
 * 6. Static blocks cannot be public
 * 7. Static blocks are initalized when class 
 *  
 */
public class StaticClass {
	
	static {
		int x = 0;
		String string = "Static Block String";
	}
	
	public static void staicMethod(){
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
//		System.out.println(StaticClass.x);
		StaticClass.staicMethod();
		
	}

}
