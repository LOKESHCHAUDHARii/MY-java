package myjava;

import java.util.Scanner;

public class BitwiseOperator{
	
	public static void main (String[] arg) {

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter 1st number: ");
   int num1=sc.nextInt();
   
   
   System.out.println("Enter 2nd number: ");
   int num2=sc.nextInt();
   sc.close();
   
   //Bitwise AND operator
   System.out.println("num1&num2="+(num1 & num2));
   
   // 0 1 0 1
   // 0 1 1 0
   // --------
   // 0 1 0 0 = 4
   
   //Bitwise OR operator
   System.out.println("num1|num2="+(num1 | num2));
	
   // 0 1 0 1
   // 0 1 1 0
   // --------
   // 0 1 1 1 = 7
   //Bitwise  operator
   
   
   
	
	
   }

}
