package week4.day1;

public class LearnOverriding extends LearnOverloading{
	/*
	 * Method overriding:
	 * the mthd signature is same and the parameters also should  be same
	 * applicable for inheritance
	 */
	
	public void add() {
		//shortcut for commenting multiple lines---->ctrl+shify+/
		
		int a=12;
		  int b=4; 
		  System.out.println(a+b);
		 
			
	}
	public static void main(String[] args) {
		LearnOverriding llo=new LearnOverriding();
		llo.add();
	}
}
