package org.sample; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class JavaVScala { 
	public static void main(String args[]) { 
		List<PersonJ> input = new ArrayList<PersonJ>();
		input.add(new PersonJ("John.POE", "Valid", 32));
		input.add(new PersonJ("John.TY", "InValid", 17));
		input.add(new PersonJ("John.OE", "Valid", 19));
		
		List<String> output = validByAge(input);
		System.out.println(output);
	}
	public static List<String> validByAge(List<PersonJ> in) {
	   List<String> ret = new ArrayList<String>(); 
	   List<PersonJ> people = new ArrayList<PersonJ>();
	   for (PersonJ p: in) {
	     if (p.valid()) { 
	    	 people.add(p);
	     }
	   }
	   Collections.sort(people, new Comparator<PersonJ>() {
	      public int compare(PersonJ a, PersonJ b) {
	        return a.getAge() - b.getAge();
	      } 
	   } );
	   for (PersonJ p: people) { 
		   ret.add(p.getFirst());
	   }
	   return ret;
	}
}