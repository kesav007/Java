package chap01.module9;

import chap01.module1.Car;

/**
 * Constructor Rules
 * 1. You cannot make a constructor final  
 * 2. Constructor will not return any object
 * 3. Constructors can be overloaded
 * 4. Constructors can be marked as private
 * 5. Java will not provide default constructor if you provide Arg Constructor
 */
public class FinalConstructor {
	
	private FinalConstructor(){		
	}
	
	public FinalConstructor(Car car){
		return;
	}
	
	public FinalConstructor(Integer i){
		
	}
	
	/*
	public final FinalConstructor(){		
	}
	*/
	
	// This is not a constructor, since its returns void 
	public void FinalConstructor() {
	}

}
