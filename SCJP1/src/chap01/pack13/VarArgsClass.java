package chap01.pack13;

/**
 * Rules of Methods with var args.. 
 * 1. var args should be final parameter of the method 
 * 2. method cannot have more than one vargs..
 * 3. var args methods can't be abstract  
 * 
 * @author Manasavi
 *
 */
public abstract class VarArgsClass {

	public void legalVargsMethod(int... x) {

	}

	// Overloaded Legal
	public void legalVargsMethod(int xy, int... x) {

	}

	// Overloaded and Legal
	public void legalVargsMethod(char xy, int... x) {

	}

	/**
	 * LEGAL
	 * var args method can't be abstract 
	 */
	public final void illegalVargsMethod(char xy, int... x) {}


	/**
	 * ILLEGAL 
	 * Too many var args types 
	 * public void illegalVargsMethod(char... xy, int...x){
	 * }
	 */

	/**
	 * ILLEGAL 
	 * var args should be last parameter 
	 * public void illegalVargsMethod(char... xy, int x){ }
	 */
	
	/**
	 * ILLEGAL
	 * var args method can't be abstract 
	 *
	 *	public abstract void illegalVargsMethod(char xy, int... x) {}
	*/
	

}