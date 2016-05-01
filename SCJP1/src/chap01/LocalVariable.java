package chap01;

/**
 * Local Variable rules
 * 1. They live on stack
 * 2. Only "final" non-access modifier can be applied
 * 3. Their life span is with in the scope of the method 
 * 4. They will not get default value like int i =0  
 * 5. They should be initalized explictily before using
 * 6. It can have the same name as class level, Its called Shawdowing
 */
public class LocalVariable {
	
	/**
	 * local variables should be initizalied first before using
	 * in the below secanrio j  should be after i = 20
	 * 
	 */
	public void localVariableMetthod(){
		int i;
//		int j = i *10;
		i = 20;
	}

}
