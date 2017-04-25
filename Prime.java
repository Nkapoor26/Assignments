package prg4;

import java.util.Scanner;

public class Prime {
	int i, n, n2;

	public void disp() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of n"+n);
			n=sc.nextInt();
			if(n==2)
			{
				System.out.println("number is prime");
			}
			n2 = n / 2;
			for (i = 2; i <=n2; i++) {
				if (n % i == 0) {
					System.out.println("Number is not Prime");
				} else {
					System.out.println(n+ " : is Prime");
					}
			}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime obj = new Prime();
		obj.disp();
	}

}