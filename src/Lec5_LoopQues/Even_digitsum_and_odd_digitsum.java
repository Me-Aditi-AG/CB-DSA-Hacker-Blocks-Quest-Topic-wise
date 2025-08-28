package Lec5_LoopQues;

import java.util.Scanner;

public class Even_digitsum_and_odd_digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculate the sum of even digit placed number and odd digit placed number
		// Eg: 2635 : 5 at pos1 , 3 at pos2 , 6 at pos3 , 2 at pos4 : calculate for even digit sum= pos2+ pos4 = 3+2=5 : odddigit sum= pos1+ pos3=5+6=11
		// By doing N/10 = we get the quotient as next upcoming N for calculating it alst digit and rem as last last digit
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		int pos=0; // for keeping the track of digit position . Intialized by 0 bcoz loops doens't start yet
		int evensum=0; //To calculate even sum of digits
		int oddsum=0; // To calculate odd sum of digits

		while(N>0) // Loop will work till N become 0
		{
		pos++;	// First we increase pos bcoz go to pos1 then we get the value of pos1 by calcukating rem and then we check pos1 is even or odd 
		        // after checking pos then we add the value of that pos acc.to if condition
		int rem= N%10; //For getting the last digit 

		if(pos%2==0) // For check pos is even or not if its even then we calculate the evensum
		{
		evensum= evensum+ rem;
		}

		else
		{
		oddsum= oddsum+ rem;
		}
		N=N/10; // For getting next N  
		}

		System.out.println("Even sum of digits =" + evensum); // To print evensum
		System.out.println("Odd sum of digits = " + oddsum); //To print oddsum
	}

}
