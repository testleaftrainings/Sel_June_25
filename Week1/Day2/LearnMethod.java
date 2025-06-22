package week1.day2;

public class LearnMethod {
	
	//accmodifier returntype mtd(args)
	
	public void addTwoNumbers(int a,int b,float c){
		System.out.println(a+b+c);
		
	}
	
	private int noOfVehicles(){
		
		return 2;
		
		
	}
	
	String vehicleData(String brandName,String brandColour){
		return brandColour+" "+brandName;
		
	}

	public static void main(String[] args) {
		
		LearnMethod LearnM=new LearnMethod();
		
		LearnM.addTwoNumbers(6, 7, 8.8f);
		
		int number = LearnM.noOfVehicles();
		System.out.println(number);
		
		System.out.println(LearnM.vehicleData("blue", "Activa"));
		
	}

}
