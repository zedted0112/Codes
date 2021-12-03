package hashmap;
import java.util.*;

public class Longestconsecutiveseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2 ,12 ,9,16 ,10, 5 ,3 ,20 ,25 ,11, 1 ,8, 6 };
 ArrayList<Integer>ans=Lcs(arr);
 System.out.println(ans);
	}
	static ArrayList<Integer> Lcs(int[]arr)
	{
		ArrayList<Integer> list= new ArrayList<>();
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int a:arr)
		{
			map.put(a,true);
		}
		
		for(int a:arr)
		{
			if(map.containsKey(a-1))
			{
				map.put(a,false);
			}
		}
		
		
		int maxLen=0;
		int start=arr[0];
		int ei=arr[arr.length-1];
		
		for(int a:arr)
		
		{
			if(map.containsKey(a)==true)
			{
				int tempL=1;
				int tempStart=a;
				while(map.containsKey(a+tempL))
				{
					tempL++;
				}
				if(tempL>maxLen)
				{
					maxLen= tempL;
					start= tempStart;
					ei= a+tempL-1;
				}
			}
		}
		list.add(start);
		list.add(ei);
		return list;
	
		
	}

}
