package chap02.module1;

import java.io.FileNotFoundException;
import java.io.IOException;

import chap01.module1.Accord;
import chap01.module1.Car;
import chap01.module1.Vechicle;

/**
 * Overloaded Class Rule 1. Can overload the method with Subclass or Super
 * Classes 2. CANNOT Overload with access modifiers or return type
 * 
 */
public class SuperClazz {

	public void fileNotFoundExceptionMethod() throws FileNotFoundException {

	}
	
	public void ioExceptionMethod() throws IOException{

	}

	protected void protectedMethodVechicle(Vechicle vechicle) {

	}

	public void publicMethodVehicle(Vechicle vechicle) {

	}

	public void publicMethodCar(Car car) {

	}

	/*
	 * public void publicMethodHonda(Honda honda) {
	 * 
	 * }
	 */
	
	public void publicMethodAccord(Accord accord) {

	}
}
