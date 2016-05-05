package chap01.module10;

import chap01.module1.Honda;

/**
 * Rules Of Final Variables 
 * 0. They should be initialized
 * 1. Once initialized the reference can't be changed but object it refers can be modified
 * 2. You cannot have a setter methods for final variables
 * 3. Once initialized you cannot assign new reference (refer: changeValue method)
 * 4. There is no such thing called Final Object
 * 5. If final is applied to method level (not class level) then subclasses cannot override
 */
public class FinalVariables {

	private final Honda honda;	

	private final Integer xyz; // You can not change the value of integer once initialized

	public Honda getHonda() {
		return honda;
	}

	public FinalVariables() {
		honda = new Honda();
		xyz = 100;
	}

	public void changeValue(Integer x, Honda honda) {
//		xyz = x;
//		this.honda = honda;
	}

	public static void main(String[] args) {
		FinalVariables fv = new FinalVariables();
		System.out.println(fv);
		fv.getHonda().setSpeed("70");
		Integer x = fv.getXyz();
		x = 19;
		System.out.println(fv);
	}

	public Integer getXyz() {
		return xyz;
	}

	@Override
	public String toString() {
		return "FinalVariables [honda=" + honda + ", xyz=" + xyz + "]";
	}

}
