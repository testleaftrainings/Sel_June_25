package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/*
		 * List:1)fifo--->ordered collection
		 * 2)allows the duplicate values
		 * syntax:interface<generic type> listname=new implementation class<generic type>();
		 */
		//add the items in the list
		List<String> learners=new ArrayList<String>();
		List<String> trainer=new ArrayList<String>();
		List<String> names=new ArrayList<>(Arrays.asList("saran","Tanush","Siva"));
		trainer.add("saranya");
		System.out.println(trainer);
		learners.add("shruthi");
		learners.add("Arunkumar");
		learners.add("chandra");
		learners.add("srinivasan");
		System.out.println(learners);
		learners.add(2, "Haritha");
		System.out.println(learners);
		
		for (int i = 0; i < learners.size(); i++) {
			System.out.println(learners.get(i));
			
		}
		//find the size of the list
		int size = learners.size();
		System.out.println(size);
		System.out.println(learners.get(size-1));
		
		//to retrieve any item from the list
		String peratNo1 = learners.get(1);
		System.out.println(peratNo1);
		//remove any item from the list
		learners.remove(3);
		System.out.println(learners);
		boolean remove = learners.remove("Haritha");
		System.out.println(remove);
		
		//clear the list
		/*learners.clear();
		System.out.println(learners);*/
		trainer.addAll(learners);
		System.out.println(trainer);
		
	}

}
