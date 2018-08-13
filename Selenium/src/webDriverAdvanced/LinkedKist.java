package webDriverAdvanced;

import java.util.List;
import java.util.ArrayList;

public class LinkedKist {

	public static void main(String[] args) {
		List<String> ll = new ArrayList<String>();
		ll.add("Kevin");
		ll.add("Peter");
		int size = ll.size();
		
		System.out.println("LinkedKist Elements: ");
		System.out.println(ll.size());
		
		for(String i : ll) {
			System.out.println(i);
		}
		

	}


}