package hashmap;

import java.util.HashMap;

public class ExractUniqueCharacter {

	public static void main(String[] args) {
		int arr[]= {4,4,4,4};
//		String str= "abbccd";
//String ans=		unique(str);
//System.out.println(ans);
pairDifference(arr,0);
	}

	private static String unique(String str) {
		
		
		
		HashMap<Character,Integer> map= new HashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			
			char c= str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		String ans="";
		for(int i=0; i<str.length(); i++)
		{
			
			char c= str.charAt(i);
			if(map.containsKey(c))
			{
				ans+=c;
				map.remove(c);
			}
		}
		return ans;
		
		
	}
	static void pairDifference(int []arr, int k)
	{
		
		
		
		
		
		   int ans=0;
			HashMap<Integer,Integer> map= new HashMap<>();
		        for(int a: arr)
		        {
		            if(map.containsKey(a))
		            {
		            map.put(a,map.get(a)+1);
		            }
		        else
		        {
		            map.put(a,1);
		            
		        }
		        }
		        System.out.println(map.size());
		        if(map.size()==1)
		        {
		        	int val= map.get(arr[0]);
		        	ans+=  val*(val-1)/2;
		    System.out.println(ans);
		        }
		        
//		        System.out.println(map.keySet());
//		        System.out.println(map);
		        for(int a:map.keySet())
		        {
		            
		            
		            if(map.containsKey(a-k))
		            {
		                ans+=map.get(a-k);
		            }
		        }
		        if(map.containsKey(0))
		        {
		            int val= map.get(0);
		            ans+=val*(val-1)/2;
		        }
//		        System.out.println(ans+" is ans");
//		        System.out.println(k);
	}

}
