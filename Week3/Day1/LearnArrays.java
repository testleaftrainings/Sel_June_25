package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/*
		 * Arrays--->collection of items of same datatype
		 * 1)Array literal--->based on data
		 *   syntax:datatype v.name[]={values}
		 */
		
		int marks[]= {65,98,78,56,90};//index starts from 0
		//length of the array
		int length = marks.length;
		System.out.println(length);//length starts from 1
		//iterate all the values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		//sort an array
		Arrays.sort(marks);//56,65,78,90,98
		System.out.println(marks[3]);
		//max value
		System.out.println(marks[length-1]);
		
		//Array instantiation
		int marks1[]=new int[4];//0,1,2,3
		marks1[0]=78;
		marks1[1]=90;
		System.out.println("values from instantiation:"+marks1[3]);
		String learners[]=new String[3];//0,1,2
		learners[0]="haritha";
		learners[1]="karthick";
		learners[2]="harshith";
		System.out.println(learners[1]);
		
		
	}

}
