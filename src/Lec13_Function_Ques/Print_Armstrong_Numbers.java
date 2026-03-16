package Lec13_Function_Ques;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		
		int count=N1;
		while(count<=N2)
		{
		int ans=isarmstrong(count);
		if(ans !=0)
		{
		System.out.println(ans);
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

		if(number==sum)
		{
		return number;
		}
		else
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
