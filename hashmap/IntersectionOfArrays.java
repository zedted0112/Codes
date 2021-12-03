package hashmap;
import java.util.*;

public class IntersectionOfArrays {
	public static void main(String[] args) {
		
		int arr1[]= { 2,3,2,3,3,5,6};
		int arr2[]= { 2,5,6};
	intersection(arr1,arr2);
	}
	
	static void intersection(int []arr1,int arr2[])
	{
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i:arr1)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		
		for(int a:arr2)
		{
			
			if(map.containsKey(a))
				
			{
				int val= map.get(a);
				
				if(val>0)
				{
					System.out.print(a+" ");
					map.put(a,val-1);
				}
			}
			
		}
		
	}

}
