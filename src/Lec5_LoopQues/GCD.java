package Lec5_LoopQues;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GCD = Greatest common divisor and HCF = Highest common factor
		// Logic :  First we have to do divide dividend by divisor then whatever rem come it will become the divisor for next upcoming dividend and the first divisor become next dividend
		//For finding GCD or HCF we has to take two no. which are dividend and divisor from user to calculate

		Scanner sc= new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();

		while(dividend % divisor !=0) // Basically loop will work till rem become zero and when rem become zero at that time whatever the divisor is it become the GCD or HCF
		{

		int rem= dividend % divisor; // First we calculate rem for next division to find GCD
		dividend= divisor; // then prev divisor becomes next dividend 
		divisor= rem; // prev rem becomes next divisor
		}

		System.out.println(divisor); // and the last divisor from which rem =0 become the GCD or HCF
	}

}
