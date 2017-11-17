package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("horse");
		animals.add("dolphin");
		animals.add("tiger");
		//for (int i = 0; i < animals.size(); i++) {
			//String a=animals.get( i);
			//System.out.println("String at element " + i + " " + a);
		//}
		//for(String a:animals) {
			//System.out.println(a);
		//}
		//for (int a = 0; a < animals.size(); a+=2) {
			//System.out.println(animals.get(a));
		//}
		//for (int a = animals.size()-1; a >=0; a--) {
			//System.out.println(animals.get(a));
		//}
	       for(String a:animals) {
	    	   if (a.contains("e")) {
				System.out.println(a);
			}
		}
		
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
