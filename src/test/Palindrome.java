package test;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5225; int r; int num=0; int temp;
temp=n;
String x="";
		String org = String.valueOf(n);
		System.out.println(org);
		char[] re = org.toCharArray();
		for(int i=re.length-1;i>=0;i--) {
			 x = re[i]+x;
		}
		System.out.println(x);
		if(x.equalsIgnoreCase(org)) {
			System.out.println("pallindrome");	
		}
		
		
		while( n>0) {	
		r= n%10;
		num =num*10+r;
		n=n/10;
		}
		
		if(num ==temp) {
			System.out.println("pallindrome");
		}
		else {
			System.out.print("not pallindrome");
		}
	int c= Integer.valueOf(org);
	}

}
