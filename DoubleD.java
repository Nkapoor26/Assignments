package prg17;

import java.util.Scanner;

public class DoubleD {
	int[][] mat1=new int[3][3];
	int[][] mat2= new int[3][3];
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Values:");
		for(int i=0;i<mat1.length;i++)
				{
			for(int j=0;j<3;j++)
			{
				mat1[i][j]=sc.nextInt();
				}
				}
	
	for(int i=0;i<mat1.length;i++)
	{
		for(int j=0;j<mat1.length;j++)
		{
			System.out.print(mat1[i][j]+"\t");
		}
	
	System.out.println();
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleD obj=new DoubleD();
		DoubleD oo=new DoubleD();
		obj.accept();
		//oo.disp();
		
	}

}
