package week1.day2;

public class LearnMethods {
	//syntax:access modifier return type mthd name
	int noOfLearners;
	public void add() {
		int a=5;
		int b=6;
		//System.out.println(a+b);
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		//syntax:classname obj name=new constructor();
		LearnMethods lm=new LearnMethods();
		lm.add();
		System.out.println(lm.noOfLearners);
		
		

	}

}
