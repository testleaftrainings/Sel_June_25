package week3.day2;

public class SBI extends Axis implements RBI,Inter{

	@Override
	public void withDrawalLimit() {
		System.out.println("10,000");
		
	}
	@Override
	public void knowYourCustomer() {
		System.out.println("aadhar card");	
		
	}
	public void goldLoan() {
		System.out.println("interest rate is 8%");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.knowYourCustomer();
		s.goldLoan();
		s.housingLoan();
		s.systemDesign();
	}
	@Override
	public void systemDesign() {
		System.out.println("deisgn is ready");
		
	}
	
	

}
