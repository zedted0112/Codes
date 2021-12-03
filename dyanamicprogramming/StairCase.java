package dyanamicprogramming;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int dp[]= new int[n+1];
		
		int ans= minimumSq(n,dp);
		System.out.println(ans);
	}
	
	
	static int stairs(int n)
	{
		int[]dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3; i<=n; i++)
		{
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}
	
	static int minStepToOne(int n)
	
	{    if (n==0 || n==1)
        return 0;
    else if (n==2 || n==3)
        return 1;
    
    int[] dp1 = new int[n+1];
  
    
    //Setting base cases
    dp1[1]=0;
    dp1[2]=1;
    dp1[3]=1;
    for (int i=4;i<=n;i++)
    {
        System.out.println("Current i: "+i);
        int ans1=dp1[i-1];
        int ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        if (i%2==0)
        {
            ans2=dp1[i/2];
        }
        if (i%3==0)
        {
            ans3=dp1[i/3];
        }
        System.out.println("ans1: "+ans1+", ans2: "+ans2+", ans3: "+ans3);
        dp1[i]=Math.min(ans1,Math.min(ans2,ans3))+1;
        System.out.println(i+": "+dp1[i]);
    }
    return dp1[n];
    
	}
	
	static int minimumSq(int n,int dp[])
	{
		
		
	if(n<=3) return n;
	
	
	int res= n;
	for(int i=1; i<n; i++)
	{
		int temp= i*i;

		if(temp>n)  break;
		else {
			if(dp[i]!=0) return dp[i];
			int smallsq=minimumSq(n-temp,dp);
			dp[i]=smallsq;
			res= Math.min(smallsq+1, res);
		}
		
	}
	return res;
		
		
	}
	
	
	
	
}
