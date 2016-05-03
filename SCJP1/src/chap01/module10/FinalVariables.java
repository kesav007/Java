package chap01.module10;

import chap01.module1.Honda;

/**
 * Rules Of Final Variables 
 * 1. Once initialized the values can't be changed
 * 2. You cannot have a setter methods for final variables
 * 3. Once initialized you cannot assign new reference (refer: changeValue method) 
 */
public class FinalVariables {

	private final Honda honda;

	private final Integer xyz; // You can not change the value of integer once
								// initialized

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
