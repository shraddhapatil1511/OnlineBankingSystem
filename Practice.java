package com.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
	       
	        names.add("Welcome");
	        names.add("To");
	        names.add("Gfg");
	 
	        // Getting ListIterator
	        Iterator<String> namesIterator
	            = names.listIterator();
	 
	        // Traversing elements using next() method 
	        while (namesIterator.hasNext()) {
	            System.out.println(namesIterator.next());
	        }

	}

}
