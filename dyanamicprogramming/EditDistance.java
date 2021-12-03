package dyanamicprogramming;

public class EditDistance {

	public static void main(String[] args) {
	String s= "wncpoddas";
	String t= "wqegesggfff";
	
    //Find the lengths of both strings
    int m=s.length();
  //  System.out.println(m);
    
    int n=t.length();
  //  System.out.println(n);
    
    int[][] dp = new int[m+1][n+1];
    System.out.println(dp.length);
    //Initializing dp for iterative approach
    for (int i=n;i>=0;i--)
        dp[m][i]=n-i;
    
    //print (dp);
  //  System.out.println();
    
    for (int i=m;i>=0;i--)
        dp[i][n]=m-i;
  //  print(dp);
    System.out.println();
//	
//int minimumstep =step(s,t,dp);
// System.out.println(minimumstep);
     int step=step(s, t, dp);
     System.out.println(step);


	}
	
	static int step(String s, String t, int[][]dp)
	{
		
		for(int i=dp.length-2; i>=0; i--)
		{
			for(int j=dp[0].length-2; j>=0; j--)
			{
				if(s.charAt(i)==t.charAt(j))
				{
					dp[i][j]=dp[i+1][j+1];
				}
				else {
					
					
					dp[i][j]= 1+Math.min(Math.min(dp[i+1][j+1],dp[i][j+1]),dp[i+1][j]);
				}
			}
		}
	
		return dp[0][0];
		
	}
	
	static void print(int[][]arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0 ;j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
