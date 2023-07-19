package test;

public class Stin {

	
	public static void main(String[] args) {
		
//		String str = "test2345";
//		
//		String num = str.replaceAll("[^0-9]", "");
//		String alp = str.replaceAll("[^A-Za-z]", "");
//		
//		int value = 65;
//		String s= "11111";
//		int b=Integer.parseInt(s);
//		String ss=String.valueOf(value);
//		System.out.println(ss);
//		
//		System.out.println(b);
//		
//		char a = (char) value;
//		System.out.println(a); 
//		int value1 = 11;
//		char a1 = String.valueOf(value1).toCharArray()[0];
//		System.out.println(a1);
	
		
//		
//		for (int i=0;i<=c.length-1;i++) {
//			int count =0;
//			for (int j=1;j<=c.length-1;j++) {
//				
//				if(c[i] == c[j]) {
//					count++;
//				}	
//				}
//			if(count==1 ) {
//				sb.append(c[i]);
//			}
//			}
//		System.out.println(sb);	
		
		
//		String str1 = "harish";
//
//		String temp = "";
//		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str1.indexOf(str1.charAt(i)));
//			if (temp.indexOf(str1.charAt(i)) == -1) {
//				temp = temp + str1.charAt(i);
//			}
//		}
//
//		System.out.println(temp + " ");
//
//	}
	
		
		String s="harish";
		
		char c[]=s.toCharArray();
		String temp="";
	for(int i=0;i<=c.length-1;i++) {
		
		if(s.indexOf(c[i])== s.lastIndexOf(c[i])) {
			
			temp= temp+c[i];
		}
	}
	
	System.out.println(temp);
		
		
	} 
}
	


