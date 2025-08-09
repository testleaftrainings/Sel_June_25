package week8.day1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		
		int num[]= {1,2,3};
		try {
			System.out.println(x/y);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println(num[3]);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
	}

}
