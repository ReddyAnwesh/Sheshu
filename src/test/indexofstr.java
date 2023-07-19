package test;

import java.util.LinkedHashSet;

public class indexofstr {

	public void distinct(String str1) {

		String temp = "";
		for (int i = 0; i < str1.length(); i++) {
	
			if (temp.indexOf(str1.charAt(i)) == -1) {
				temp = temp + str1.charAt(i);
			}
		}
		
		System.out.println(temp + " ");
		
	}

	public static void main(String[] args) {

		indexofstr s = new indexofstr();
		s.distinct("this is for checking the string");
		
		System.out.println(distinctApproach2("this is for checking the string"));
		
			
	}
	
	public static String distinctApproach2(String str2) {
		
		char[] ch = str2.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c : ch) {
			
			set.add(c);
		}
		
		System.out.println(set);
		
		char[] ch1 = new char[set.size()];
		
		int i =0;
		for(char c : set) {
			ch1[i++] = c;
		}
		
		String distinct = String.valueOf(ch1);
		
		return distinct;
		
	} 

}
