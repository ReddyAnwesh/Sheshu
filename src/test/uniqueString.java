package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class uniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "harish";

		char[] c = s.toCharArray();

		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i <= c.length - 1; i++) {

			set.add(c[i]);

		}
		
		System.out.println(set);

	}

}
