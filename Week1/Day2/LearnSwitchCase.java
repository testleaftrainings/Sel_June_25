package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="firefox";
		switch (browser) {
		case "Chrome":
			System.out.println("open chrome browser");
			break;
			
		case "Edge":
			System.out.println("open edge browser");
			break;
			
		case "safari":
			System.out.println("open safari browser");
			break;
			default:
				System.out.println("open IE");
			
			
		}
	}

}
