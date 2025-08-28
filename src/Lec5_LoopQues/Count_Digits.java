package Lec5_LoopQues;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In this ques N is give by user and also one digit given by user we have to calculate how many time that digit occur in that no.
		// Eg: 234234232 no. given by user and 2 is the digit given :Output = 4 time 2 will come in that no.
				
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int digit = sc.nextInt();

		int val=0; // For keeping the track of how many time the give digit occurs
		while(N>0) // Loop will work till N becomes 0
		{

		int rem= N%10; // First we have to calculate the alst digit

		if(rem==digit) // Then we check that number is equals to the value of given digit or not
		{              // If the rem value =  digit value then we inc the val bcoz we got that given digit in the number and hence it goes till N>0
		val++;
		}

		N=N/10; // For calculating next remaining no. after removing last digit
		}

		System.out.println(val); // Here we prints the value of val bcoz it keeps the track of how many times given digit occurs

	}

}
