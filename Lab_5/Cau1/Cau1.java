public class Cau1
{
	public static int[][] add_Matrix(int[][] arr, int[][] arr1)
	{
		int[][] result = new int[arr.length][arr1[0].length];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				result[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		return result;
	}
	
	public static int[][] multi_Matrix(int[][] arr, int[][] arr1)
	{
		
		int[][] result = new int[arr.length][arr1[0].length];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr1[0].length; j++)
			{
				for(int k = 0; k < arr1.length; k++)
				{
					result[i][j] += arr[i][k]*arr1[k][j];
				}
			}
			
		}
		return result;
	}
	
	
	public static void printInfo(int[][] a)
	{
		for(int[] x : a)
		{
			for(int y : x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[][] arr = {{7,8,9},{12,23,78}};
		int[][] arr1 = {{1,2,3},{4,5,6}};
		int[][] arr2 = {{8,9},{23,78}, {-5,8,}};
		int[][] arr3 = {{7,8,9},{12,23,78}};
		
		printInfo(add_Matrix(arr,arr1));
		printInfo(multi_Matrix(arr3,arr2));
	}
}