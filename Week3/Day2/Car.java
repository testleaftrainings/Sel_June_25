package week3.day2;

public class Car extends Vehicle {
	public void steering() {
		System.out.println("adjusting the controls--->car");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.steering();
		c.applyBrake();
		c.applyGear();
		
	}

}
