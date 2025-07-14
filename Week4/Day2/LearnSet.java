package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		String s="saran";
		char[] charArray = s.toCharArray();
		
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> duplicate=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);//true or false
			if (!b) {
				duplicate.add(charArray[i]);
				
			}
			
		}
		System.out.println("unique values are:"+unique);
		System.out.println("duplicate is:"+duplicate);

	}

}
