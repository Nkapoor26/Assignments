package prg9;

import java.util.Scanner;

public class Primetill {
	int i =0;
    int num =0;
    public void disp()
    {
    	Scanner scanner = new Scanner(System.in);
	      
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);// prints 1 to n prime numbers
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		      Primetill obj= new Primetill();
		      obj.disp();
		   }
		}
