package prg2;

import java.util.Scanner;

public class Fact {
int n,i,fact=1;
public void disp() {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n"+n);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(""+fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fact obj=new Fact();
obj.disp();
	}

}
