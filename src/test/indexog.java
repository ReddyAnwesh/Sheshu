package test;

public class indexog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String h1="harish";
		System.out.println(h1.indexOf("h"));
		char c[]=h1.toCharArray();
		String temp="";
		for(int j=0;j<c.length;j++) {
		
		if(h1.indexOf(c[j]) == -1){
			
			temp=temp+c[j];
		}
		
		}
	
		System.out.println(temp);
	}

}
