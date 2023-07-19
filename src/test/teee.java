package test;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class teee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("Enter input: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		HashMap<Character, Integer> list = new HashMap<Character, Integer>();
		for(Character c : s.toCharArray())
		{
			if(list.containsKey(c))
			{
				list.put(c, list.get(c)+1);
			}
			else
			{
				list.put(c, 1);
			}
		}
		for(Map.Entry e: list.entrySet())
		{
			if((int)e.getValue() == 1)
				System.out.println(e.getKey());
		}

	}

}
