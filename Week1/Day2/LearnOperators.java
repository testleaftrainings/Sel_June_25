package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic operators
		
		System.out.println(5+5);
		System.out.println(8%3);//modulo--->remainder
		System.out.println(4/2);//division--->quotient
		
		//Assignment operators
		
		int a=7,b=10;
		a+=5;//a=a+5
		System.out.println(a);
		b-=5;//b=b-5
		System.out.println(b);//5
		b*=5;
		System.out.println(b);//25
		
		//comparison operators
		
		System.out.println(4==5);
		System.out.println(7>=5);
		
		//Logical operators
		System.out.println((4==4)&&(5<5)||(7==7));//true(1)*false(0)---->0(false)+true(1)--->1(true)
		System.out.println((7==8)||(5>6));//false(0)+false(0)--->0(false)
		
		//unary operators
		
		int x=1;
		System.out.println(++x);//2
		System.out.println(x++);//2
		System.out.println(x);//3
		System.out.println(x++);//3
		System.out.println(x);//4
		
		LearnMethod m=new LearnMethod();
		
		System.out.println(m.vehicleData("red", "suzuki"));
		
		

	}

}
