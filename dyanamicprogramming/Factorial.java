package dyanamicprogramming;

public class Factorial {

	public static void main(String[] args) {
	
int ans= facto(6);
System.out.println(ans);

	}
	
	static int facto(int n)
	{
		//base case 
		if(n==0||n==1) return n;
		
		// recursive calls;
		int smallAns= facto(n-1);
		int myAns= n*smallAns;
		return myAns;
		
	
	}

}
