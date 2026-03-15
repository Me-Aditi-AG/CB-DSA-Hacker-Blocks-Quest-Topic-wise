package Lec13_Function_Ques;

import java.util.Scanner;

public class Inverse_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();

		System.out.println(inverse(N));  // Calling inverse function and printing the return value of inverse
		    }

		public static int inverse(int N) //Getting int value of N as arguement passed by inverse(N)
		{

		int pos=1;
		int sum=0;

		while(N>0)
		{

		int rem= N%10;

		sum= (int) (sum+ pos * Math.pow(10,rem-1));
		pos++;
		N=N/10;
		}

		return sum;  // Return inverse value which is store in sum to the function inverse(N)
		}

}
