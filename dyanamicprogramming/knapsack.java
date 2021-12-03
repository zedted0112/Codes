package dyanamicprogramming;

public class knapsack {

	public static void main(String[] args) {
		
		
		
		int[] weights= {2,4,5,6,7};
		int []values= {12,10,4,13,8};
		int max=70;
		
		int ans= knapsack(weights,values,0,max);
		System.out.println(ans);
	}
	
	static int knapsack(int[]weights, int []val,int i,int max) {
		if(i==val.length) return 0;
		int ans;
		
		if(weights[i]<=max)
		{
			
			ans=Math.max(val[i]+knapsack(weights,val,i+1,max-weights[i]),knapsack(weights,val,i+1,max));
		}
		else
		{
			ans=knapsack(weights,val,i+1,max);
		}
		
		return ans;
		
		
		
		
		
		
		
		
		
		
	
	}

}
