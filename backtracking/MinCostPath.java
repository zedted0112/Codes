package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostPath {

	public static void main(String[] args) {
	
		
		
		Scanner s = new Scanner (System.in);
	
		int n = s.nextInt();
		int m = s.nextInt();
		int[][]arr= new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 arr[i][j]=s.nextInt();
			}
		}
		int dp[][]= new int[n+1][m+1];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 dp[i][j]=Integer.MIN_VALUE;
			}
		}
		
		
		
		
		
		int minCostPath= minCost(arr,0,0,dp);
		System.out.println(minCostPath);
		
		

	}
	
	static int minCost(int[][]arr, int i, int j,int[][]dp) {
		
		int n = arr.length;
		int m= arr[0].length;
		if(i==n-1&&j==m-1) return arr[i][j];
		if(i>=n || j>=m) return Integer.MAX_VALUE;
	
		int ans1, ans2,  ans3;
	if(dp[i+1][j]==Integer.MIN_VALUE)
	{	
	
		ans1= minCost(arr,i+1,j,dp);
		dp[i+1][j]=ans1;
	}
	
	else {
		ans1=dp[i+1][j];
	}
	
	if(dp[i][j+1]==Integer.MIN_VALUE)
		
	{
	
	
		ans2= minCost(arr,i,j+1,dp);
	dp[i][j+1]=ans2;
	}
	else {
		ans2=dp[i][j+1];
	}
	
	if(dp[i+1][j+1]==Integer.MIN_VALUE)
	{
	ans3= minCost(arr,i+1,j+1,dp);
	dp[i+1][j+1]=ans3;
	}
	else {
		ans3= dp[i+1][j+1];
	}
		int myans= arr[i][j]+Math.min(Math.min(ans2, ans3),ans1);
		return myans;
		
	}

}
