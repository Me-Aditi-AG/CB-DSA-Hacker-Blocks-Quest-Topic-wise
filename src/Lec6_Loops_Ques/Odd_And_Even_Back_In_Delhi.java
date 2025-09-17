package Lec6_Loops_Ques;

import java.util.Scanner;

public class Odd_And_Even_Back_In_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

for(int j=1;j<=N;j++)
{
int digit=sc.nextInt();
carCheck(digit);
	}

}
public static void carCheck(int N)
{
	int evensum=0;
	int oddsum=0;
	int i=1;
	while(N>0)
	{
	int rem= N%10; //Getting last digit of the number

	if(i%2==0)
	{
	evensum=evensum+rem;//adding last didgit of number for getting the sum
	}
	else
	{
	oddsum=oddsum+rem;
	}
	N=N/10;
	i++;

	}

	//System.out.println(oddsum);
	//System.out.println(evensum);
	if(evensum%4==0 || oddsum%3==0) //then again its checking that evensum is divisible by 4 or not if its divisible by 4 
	{
	System.out.println("Yes"); //then if it prints "Yes" which means that even sum number car will allowed on sunday
	}else
	{
	System.out.println("No"); 
	}
	}
}


