package week3.day2;

public class ICICI extends UnionBank{

	@Override
	public void withDrawalLimit() {
		System.out.println("15,000");
		
	}

	@Override
	public void knowYourCustomer() {
		System.out.println("any proof");
	}

	@Override
	public void convertCurrency() {
			System.out.println("in dollars");
	}
	public static void main(String[] args) {
		ICICI obj=new ICICI();
		
	}

}
