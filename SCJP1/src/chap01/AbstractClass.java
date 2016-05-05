package chap01;

/**
 * Rules Of Abstract
 * 
 * 0. It may contain constructor but cannot be initailzed with new Keyword 
 * 1. If atleast one method marked as abstract, then whole class will be abstract 
 * 3. It may or may not contain abstract methods & concreate methods
 * 4. It cannot be marked as final
 * 5. you need to have abstract key word in front of the method if you don't have body
 *
 */
public abstract class AbstractClass {

	public void implementedMehod() {

	}
	
	public AbstractClass() {
		
	}

	/*
	 * you need to have abstract key word in front of the method if you don't
	 * have body
	 */
	abstract String returnString();

	public static void main(String[] args) {
		System.out.println("Test");
	}

}
