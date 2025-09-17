package Lec6_Loops_Ques;

import java.util.Scanner;

public class Nth_Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonnaci series a series in which the next no. is equals to the sum of prev two numbers
				//Fibonnaci series : 0,1,1,2,3,5,8,13,21,.......so on
				//Printing fibonnaci number for given N in term of a
						
				Scanner sc= new Scanner(System.in);
				int N= sc.nextInt(); //For taking the no. for which we get the fibonnaci value : Eg: N=6: fibonnaci value for pos6 is 8

				int a=0; //First no. of fibonnaci series
				int b=1;// Second no. of fibonnaci series 
				        // after adding a&b we get the next no.

				for(int i=1;i<=N;i++) //i<=N use for print fibonnaci number in a terms bcoz acc.to dry run when i=6 then it stores a=8 
				{
				int c=a+b; //For getting third no. after adding a&b
				a=b; // then after prev b becomes next a
				b=c; // value of c become next b then again we add a&b for getting new c which will be the next fibonnaci no.
				}

				System.out.println(a);

	}

}
