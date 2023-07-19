package test;

public class AddingThenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =54678; int r; int sum=0;
		
		while( n>0) {
			
		r= n%10;
		sum =sum+r;
		n=n/10;
		
		}
		
		System.out.print(sum);
	}

}
