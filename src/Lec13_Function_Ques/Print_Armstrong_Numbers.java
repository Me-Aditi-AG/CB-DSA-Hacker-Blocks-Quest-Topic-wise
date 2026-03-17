package Lec13_Function_Ques;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N1=sc.nextInt(); //starting of number
		int N2=sc.nextInt(); // ending of number
		
		int count=N1;
		while(count<=N2) //Loop to print armstrong numbers between N1 to N2
		{
		int ans=isarmstrong(count); 
		if(ans !=0) //I do this bcoz only 407 is armstrong number between 400 to 1000 
		{           // And for every another number we get 0 as return so we cant print all the 0's
		System.out.println(ans); //So if the ans is not equal to 0 then it print that number which is armstrong
		}
		count++;
		}
			}

		public static int isarmstrong(int N) //Calling function isarmstrong and passing the value of N
		{
		int number=N;
		int sum=0;

		int val= countdigit(N); // Calling function countdigit and passing the value of N 
		                        //Also storing return value of count in val
		while(N>0)
		{

		int rem=N%10;
		sum= (int) (sum+Math.pow(rem, val)); //Calculating armstrong number
		N=N/10;
		}

		if(number==sum) //If we find the armstrong number then return that number
		{
		return number;
		}
		else  //It is must to write this if the number between N1 tO N2 is not a armstrong number we return 0
		{
		return 0;
		}
		}

		public static int countdigit(int N) //Function to count digit
		{

		int count=0;

		while(N>0)
		{
		int rem=N%10;
		count++;
		N=N/10;
		}

		return count;
		}
	
	

}
