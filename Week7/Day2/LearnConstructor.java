package week7.day2;

public class LearnConstructor {
	/**
	 * Constructor:
	 * 1)-it is used to initialize the state of the objects
	 * -constructor and methods looks same but in constructor ,return type wont be there.
	 * -constructor name should be same as class name.
	 * types:
	 * 1)default--(no args)
	 * 2)parameterized--(constructor overloading)-->allows the class to have the multiple constructors each with 
	 *                   same name but different parameters.
	 *  this:
	 *  -used to differentiate the local and global varaible inside the class.
	 *  can you call one constructor from another constructor?
	 *  yes--this keyword(constructor chaining)
	 *  
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		this(90, "karthikeyani", true);
		System.out.println("default constructor");
		//empId=87;
		
	}
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		//this();
		System.out.println("parameterized  constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * LearnConstructor lc1=new LearnConstructor(65, "saran", true);
		 * System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 */
		 
		
			
			  LearnConstructor lc=new LearnConstructor();
			  System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
			 
	}

}
