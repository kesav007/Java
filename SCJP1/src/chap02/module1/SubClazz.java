package chap02.module1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import chap01.module1.Accord;
import chap01.module1.AshokLayland;
import chap01.module1.Bus;
import chap01.module1.Car;
import chap01.module1.Vechicle;

/**
 * Car is a vehicle Honda is car Honda is Vehicle Bus is a Vehicle AshokLayland
 * is Bus AshokLayland is Vehicle Car is not Bus
 * 
 * Rules of Subclass 
 * 1. Superclass method @param cannot be overridden with with subclass @param
 * Example: Superclass method vehicle @param cannot be replaced with Bus or Car object 
 * 2. Superclass method @param can be replaced Superclass object 
 * Example: Super class method accord @param can be replace
 * with Car or Vehicle Object 
 * 3. Can call super class method with Subclass object 
 * Example: if Superclass @param is Vehicle, then It can accept Bus or Car
 * 3. Can pass subclass object to super class method
 */

public class SubClazz extends SuperClazz {
	
	//Bus bus = new AshokLayland();

	Accord accordCar = new Accord();

	/**
	 * 1. Subclass methods cannot throw Exception super class but can throw Same Exception or Exception Subclass or Completely avoid
	 * 2. CANNOT Add new Exception or non-runtime exception
	 * */
	@Override
	public void fileNotFoundExceptionMethod() throws FileNotFoundException, NumberFormatException{
	
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
	 * Overriden method can pass the Sub class param to the super class object
	 */
	
	public void publicMethodVehicle(Vechicle vechicle){
		Bus bus = new AshokLayland();
		super.publicMethodVehicle(bus);
	}

	/**
	 * Cannot replace Super class object in
	 * 
	 * @param car
	 */
	public void publicMethodAccord(Car car) {
		// super.publicMethodAccord(car);
	}
}