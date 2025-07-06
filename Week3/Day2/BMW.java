package week3.day2;

public class BMW extends Car{
	
	public void voiceCommand() {
		System.out.println("voice cmd is enabled---->bmw class");
	}
	public void tunONAc() {
		System.out.println("AC is turned on---->bmwclass");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBrake();
		b.steering();
		b.tunONAc();
	}

}
