package Lokesh;
import java.util.*;
public class Array_matrix {

	public static void main(String[] args)
	{
		int i,j,row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of rows :");
		// Taking row as input
		row=sc.nextInt();
		System.out.println("enter the no.of col :");
		// Taking columns as input
		col=sc.nextInt();
		//Declaring the 2-D matrix
		int array[][]=new int [row][col];
		//Read the matrix value
		System.out.println("Enter the elements of array");
		//Loop for Row
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
		{
		array[i][j]=sc.nextInt();
		//Accessing arrays values
		}
		}
		System.out.println("Elements of array : ");
		for(i=0;i<row;i++)
			//Print arrays values
		{
			
		for (j=0;j<col;j++)
		{
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
		
	}
}
}



