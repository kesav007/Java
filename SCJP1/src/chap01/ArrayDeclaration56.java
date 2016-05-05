package chap01;

import chap01.module1.Honda;

/**
 * Arrays live on heap Arrays are objects Arrays can hold primitives or Java
 * Objects Arrays can hold only 1 type
 * 
 */
public class ArrayDeclaration56 {

	/**
	 * Legal
	 */
	Honda[] cars = new Honda[1];
	Honda cars1[] = new Honda[5];

	/**
	 * Two Dimensional
	 */
	Honda[][] cars2 = new Honda[5][2];
	Honda[] cars3[] = new Honda[5][2];
	Honda cars4[][] = new Honda[5][2];

	public void addCars() {
		cars[1] = new Honda();
	}

	public static void main(String[] args) {
		ArrayDeclaration56 arrayDeclaration56 = new ArrayDeclaration56();
		arrayDeclaration56.addCars();
	}

}
