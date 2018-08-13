package webDriverAdvanced;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample1 {

	public static void main(String[] args) {
		
		
		//creating a list 
		List<String> al = new ArrayList<String>();
		//Add elements to list 
		
		al.add("khaiyum");
		al.add("suresh");
		al.add("rama");
		al.add("rohit");
		al.add("raghav");
		al.add("donna");
		// delete elements form list
		al.remove(1);
		al.add("purohit");
		//list size
		
		int size= al.size();
		System.out.println("ArrayList Elements: ");
		
		//System.out.println(al);
		System.out.println(al.size());
		
		//loop to print list values
		System.out.println(al);
		
		for(String i : al) {
			System.out.println(i);
		}

	
	}
	
	
	
}


