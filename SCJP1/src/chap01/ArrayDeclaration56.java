package chap01;

/**
 * Arrays live on heap Arrays are objects Arrays can hold primitives or Java
 * Objects Arrays can hold only 1 type
 * 
 */
public class ArrayDeclaration56 {

	/**
	 * Legal
	 */
	AbstractCar[] cars = new AbstractCar[1];
	AbstractCar cars1[] = new AbstractCar[5];

	/**
	 * Two Dimensional
	 */
	AbstractCar[][] cars2 = new AbstractCar[5][2];
	AbstractCar[] cars3[] = new AbstractCar[5][2];
	AbstractCar cars4[][] = new AbstractCar[5][2];

	public void addCars() {
		cars[1] = new Honda();
	}

	public static void main(String[] args) {
		ArrayDeclaration56 arrayDeclaration56 = new ArrayDeclaration56();
		arrayDeclaration56.addCars();
	}

}
