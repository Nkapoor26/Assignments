package prg6;

import java.util.Scanner;

public class Greatest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
	    System.out.println("Enter three integers ");
	    Scanner in = new Scanner(System.in);

	    x = in.nextInt();
	    y = in.nextInt();
	    z = in.nextInt();

	    if ( x > y && x > z )
	       System.out.println("First number is largest."+x);
	    else if ( y > x && y > z )
	       System.out.println("Second number is largest."+y);
	    else if ( z > x && z > y )
	       System.out.println("Third number is largest."+z);
	    else   
	       System.out.println("Entered numbers are not distinct.");
	}

}
