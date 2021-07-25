package dynamic;
import java.util.*;
public class MatrixChainMultiplication {

	public static void main(String[] args) {
		int p[] = {10, 20, 30, 40, 30};
		System.out.println("The minimum number of multiplications are: "+matrixMulti(p,1,p.length-1));
		//size of t array depends upon the constraints given in question 
		int t[][]=new int[p.length][p.length];
		for(int i[]:t)
		{
			Arrays.fill(i, -1);
		}
		System.out.println("The minimum number of multiplications by top down are: "+matrixMultiTopDown(p,1,p.length-1,t));
	}

	private static int matrixMulti(int[] a, int i, int j) {
		if(i>=j)
			return 0;
		int min=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++)
		{
			int temp=matrixMulti(a,i,k) + matrixMulti(a,k+1,j) + a[i-1]*a[k]*a[j];
			if(temp<min)
				min=temp;
		}
		return min;
	}

	private static int matrixMultiTopDown(int[] a, int i, int j,int t[][]) {
		if(i>=j)
			return 0;
		if(t[i][j]!=-1)
			return t[i][j];
		t[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++)
		{
			t[i][j]=Math.min(t[i][j],matrixMultiTopDown(a,i,k,t) + matrixMultiTopDown(a,k+1,j,t) + a[i-1]*a[k]*a[j]);
		}
		return t[i][j];
	}
}
