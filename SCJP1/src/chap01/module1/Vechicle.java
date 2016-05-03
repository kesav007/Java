package chap01.module1;

/**
 * Abstract Class Rules
 * 1. It should have abstract key word
 * 2. Abstract classes cannot be initialized with the new Keyword
 * 3. You can make Abstract class with out any abstract methods
 * 4. If you have a abrstrace method then you should make class as abstract
 * 5. you cannot make it final abstract.
 * 6. you can have final methods
 */
public abstract class Vechicle {
	private String type;

	public abstract void goUpHill(); // Abstract method

	public String getType() { // Non-abstract method
		return type;
	}
	
	public final void finalMethod(){
		
	}
}
