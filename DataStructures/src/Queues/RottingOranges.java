package Queues;
import java.util.*;
class Index
{
	int row;
	int col;
	public Index(int row,int col)
	{
		this.row=row;
		this.col=col;
	}
}

public class RottingOranges {

	
	public static int Rotten(int a[][])
	{
		Queue<Index> qu=new LinkedList();
		int freshcount=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j] == 2)
				{
					qu.add(new Index(i,j));
				}
				else if(a[i][j] == 1)
					freshcount++;
			}
		}
		int directions[][]= {{1,0},{0,1},{-1,0},{0,-1}};
		int count=0;
		while(!qu.isEmpty() && freshcount > 0)
		{
			count++;
			int size=qu.size();
			while(size --> 0)
			{
				Index temp=qu.poll();
				
				for(int d[]: directions)
				{
					int row=temp.row+ d[0];
					int col=temp.col+ d[1];
					if(row<0 || col<0 || row>=a.length || col<=a[0].length || a[row][col]==0 || a[row][col]==2)
						continue;
					qu.add(new Index(row,col));
					a[row][col]=2;
					
					freshcount--;
				}
			}
		}
		return freshcount == 0?count : -1;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = { {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
		int ans = Rotten(arr);
		if(ans == -1)
			System.out.println("All oranges cannot rot");
		else
			System.out.println("Time required for all oranges to rot = " + ans);

	}

}
