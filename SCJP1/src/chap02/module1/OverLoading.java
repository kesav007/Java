package chap02.module1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * CAN LOAD DIFFERENT ARGUMENTS
 * 
 * CANNOT LOAD DIFFERENT RETURN TYPES
 * 
 * CANNOT LOAD DIFFERNT EXCEPTIONS
 * 
 */
public class OverLoading extends SuperClazz {

	public void overLoadingMethod() {
	}

	public void overLoadingMethod(int x) {
	}

	public void overLoadingMethod(List<String> list) {
	}

	public void overLoadingMethod(Integer x) {
		
	}
	
	public Integer overLoadingMethod(Integer x, int y) {
		return null;
	}
	
	/*
	public Integer overLoadingMethod(Integer x) {
		return null;
	}
	*/
	
	/*
	public void overLoadingMethod(Integer x) throws IOException{
		
	}
	*/
	
	public void overLoadingMethod(String x) throws IOException{
		
	}
	
	/*
	public void overLoadingMethod(String x) throws FileNotFoundException{
		
	}
	*/

}