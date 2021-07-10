package recursion;

public class floodFill {

	public static void main(String[] args) {
		
		int a[][]= {{1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,0,0},
					{1,0,0,1,1,0,1,1},
					{1,2,2,2,2,0,1,0},
					{1,1,1,2,2,0,1,0},
					{1,1,1,2,2,2,2,0},
					{1,1,1,1,1,2,1,1},
					{1,1,1,1,1,2,2,1}
					};
		//change color of all the 1 linked to each other to 4. row=3, col=0
		floodfill(a,3,0,4,1);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
		
	public static void floodfill(int a[][],int r,int c,int newColor,int prevColor)
	{
		int row=a.length;
		int col=a[0].length;
		if(r<0 || r>=row || c<0 || c>=col)
		{
			return;
		}
		if(a[r][c]!=prevColor)
			return;
		a[r][c]=newColor;
		floodfill(a,r-1,c,newColor,prevColor);
		floodfill(a,r+1,c,newColor,prevColor);
		floodfill(a,r,c-1,newColor,prevColor);
		floodfill(a,r,c+1,newColor,prevColor);
	}
}
