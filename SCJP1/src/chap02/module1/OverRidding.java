package chap02.module1;

import java.io.FileNotFoundException;

import chap01.module1.Accord;
import chap01.module1.AshokLayland;
import chap01.module1.Bus;
import chap01.module1.Car;
import chap01.module1.Vechicle;

/**
 * Car is a vehicle 
 * Honda is car 
 * Honda is Vehicle 
 * 
 * Bus is a Vehicle 
 * AshokLayland is Bus 
 * AshokLayland is also Vehicle 
 * 
 * Car is not Bus
 * 
 * Rules of Overriding
 * 1. Superclass method @param cannot be overridden with with subclass @param
 * Example: Superclass method vehicle @param cannot be replaced with Bus or Car object If it is then its overloading
 * 2. Superclass method @param can be replaced Superclass object 
 * Example: Super class method accord @param can be replace
 * with Car or Vehicle Object 
 * 3. Can call super class method with Subclass object 
 * Example: if Superclass @param is Vehicle, then It can accept Bus or Car
 * 3. Can pass subclass object to super class method
 */

public class OverRidding extends SuperClazz {
	
	//Bus bus = new AshokLayland();

	Accord accordCar = new Accord();

	/**
	 * 1. Overridden methods cannot throw Exception If Super method doesn't throw
	 * 2. Can throw Same Exception or Exception Subclass or Completely avoid
	 * 3. CAN Add new Checked Exception 
	 * 4. CANNOT Add new runtime exception
	 * */
	@Override
	public void fileNotFoundExceptionMethod() throws FileNotFoundException, NumberFormatException { // SQLException
	
	};
	
	/**
	 * Subclass methods cannot throw super class exception but can throw Subclass exception
	 * Example: if super class throws IOException, then overridden method can throw FileNotExeption NOT ViseVerse
	 * or new Checked Exceptions
	 * */
	
	@Override
	public void ioExceptionMethod() throws FileNotFoundException{

	}
	
	/**
	 * Overridden method can pass the Sub class param to the super class object
	 */

	@Override
	public void publicMethodVehicle(Vechicle vechicle){
		Bus bus = new AshokLayland();
		super.publicMethodVehicle(bus);
	}

	/**
	 * CANNOT pass Subclass Object for SuperClass Object
	 * BUT CAN ACCEPT SUPERCLASS OBJECT 
	 * EX: CAN NARROW DOWN FROM ACCORD TO CAR TO VECHICLE
	 */
	public void publicMethodAccord(Car car) {
		// super.publicMethodAccord(car);
	}
	

	/**
	 * Over Loading
	 */
//	@Override
	public void publicMethodVehicle(Car vechicle) {
//		super.publicMethodVehicle(vechicle);
	}
}