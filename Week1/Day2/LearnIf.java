package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		int marks=20;
		//shortcut  for if--->type if and do ctrl+space
		if (marks>=30) {
			System.out.println("pass");
			
		}
		if (marks>=50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		
		int marks1=70;
		
		if (marks1==60) {
			System.out.println("grade1");
			
		} else if(marks1<40){
			System.out.println("fail");
		}
		else if(marks1>=85) {
			System.out.println("distinction");

		}
		else {
			System.out.println("out of range");
		}

	}

}
