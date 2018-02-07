package training.lab5.collection;

import java.util.*;
class TestSet {
	public static void main(String args[]) {
		Map address = new HashMap(); 
        
		address.put("Somchai", "0 Hontang Rd.");         
		address.put("Somying", "4 Privet Drive");         
		address.put("Somporn", "0 Hontang Rd.");         
		     
		System.out.println(address); 

		System.out.println(address.get("Somporn"));             
	}
}