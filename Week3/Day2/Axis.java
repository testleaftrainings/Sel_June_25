package week3.day2;

public class Axis implements RBI {

	@Override
	public void withDrawalLimit() {
		
		System.out.println("20000");
	}

	@Override
	public void knowYourCustomer() {
		
		System.out.println("pancarrd");
	}
	public void housingLoan() {
		System.out.println("interest rate 10%");
	}
	public static void main(String[] args) {
		Axis a=new Axis();
		a.knowYourCustomer();
	}

}
