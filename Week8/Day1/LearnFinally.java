package week8.day1;

public class LearnFinally {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		
		//int num[]= {1,2,3};
		try {
			System.out.println(x/y);
			
		} 
			  catch (Exception e) { System.out.println(e); }
			 
		
		finally {
			System.out.println("finally done");
		}
		System.out.println("done");

	}

}
