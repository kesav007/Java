package chap01;

import java.io.IOException;

public class myInterfaceImpl implements myInterface{

	@Override
	/**
	 *  Override methods cannot throw new Checked Exceptions or broader
	 *  
	 *  It can throw Runtime exceptions Demo below
	 */
	public void method1()  throws NumberFormatException {//throws IOException{
		// TODO Auto-generated method stub
		
	}

	/**
	 *  Override methods may skip Checked Exceptions by super class	 
	 */
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
