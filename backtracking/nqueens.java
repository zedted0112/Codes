package backtracking;

public class nqueens {

	public static void main(String[] args) {
	nqueen(4);

	}
	
	static void nqueen(int n)
	{
		int board[][]= new int[n][n];
		solveboard(board,0,n);
	}

	private static void solveboard(int[][] board, int row, int n) {
	
		
		
		
		if(row==n)
		{
			print(board,n);
			return;
		}
		
		for( int i=0;i<n;i++)
		{
			if(isSafe(board,row,i,n))
				
			{
				board[row][i]=1;
				solveboard(board, row+1, n);
				board[row][i]=0;
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
	}
	
	private static boolean isSafe( int[][]board,int row,int col,int n)
	{
		int i,j;
		for(i=0; i<row; i++) {
			if(board[i][col]==1)
			{
				return false;
			}
		}
		
		// upper left diagonal
		for(i=row,j=col; i>=0&&j>=0; j--,i--)
		{
			if(board[i][j]==1) return false;
		}
		// uuper right daigonal
		for(i=row,j=col; i>=0&&j<n; j++,i--)
		{
			if(board[i][j]==1) return false;
		}
		
		
		
		
		return true;
	}

	private static void print(int[][] board, int n) {
	 
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		
	}

}
