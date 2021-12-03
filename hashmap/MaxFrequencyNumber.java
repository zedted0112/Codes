package hashmap;

import java.util.HashMap;



public class MaxFrequencyNumber {

	public static void main(String[] args) {
		

		int[]arr= {2 ,12, 2, 11 ,12, 2 ,1 ,2, 2, 11, 12, 2, 6};
		int ans= maxFeq(arr);
		System.out.println(ans);
	}
	
	static int maxFeq(int []arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr)
		{
			if(map.containsKey(i))
			{
				int nf= map.get(i)+1;
				map.put(i,nf);
			}
			else{
				map.put(i, 1);
			}
		}
		System.out.println(map);
		
		
		int max= Integer.MIN_VALUE;
		
		int maxele=arr[0];
		for(int i:arr)
		{
			
			if(map.get(i)>max)
			{
				max= map.get(i);
				maxele= i;
			}
		}
		return maxele;
		
		
}
}
