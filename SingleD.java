package prg16;

import java.util.Scanner;

public class SingleD {
	int i,j;
int[] rollno= new int[10];
public void accept()
{
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<10;i++)
			{
		rollno[i]=sc.nextInt();
			}
	for(int j=0;j<10;j++)
	{
		System.out.println("rollno is:"+rollno[j]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleD obj= new SingleD();
obj.accept();
	}

}
