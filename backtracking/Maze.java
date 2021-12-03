package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {

	public static void main(String[] args) {
		int  path= maze(" ",3,3);
		System.out.println(path);
		ArrayList<String> paths= mazepath("", 3, 3);
		System.out.print(paths);
		
	}
	static int maze(String asf,int row, int col)
	{
		if(row==1||col==1)
		{
			return 1;
		}
		int count =0;
		
	if(row>1)	
	 {count+=	maze(asf+"D",row-1,col);
	 }
	if(col>1)
	{
		count+=	maze(asf+"R",row,col-1);
	}
	
	
	return count;
	}
	static ArrayList<String> mazepath(String asf,int row, int col)
	{
		if(row==1||col==1)
		{
			ArrayList<String> path = new ArrayList<>();
			path.add(asf);
			return path;
		}
		ArrayList<String> path = new ArrayList<>();
	
		
	if(row>1)	
	 {path.addAll( mazepath(asf+"D",row-1,col));
	 }
	if(col>1)
	{
		path.addAll( mazepath(asf+"r",row,col-1));
	}
	
	
	return path;
	}



}
