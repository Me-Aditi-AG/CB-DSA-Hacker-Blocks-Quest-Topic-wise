package Lec13_Function_Ques;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int digit= sum_of_digit(N); //To get sum of digit of a given number

int val= is_boston_number(N); //To get sum of digit of a prime factors

if(digit==val) // If sum of digits = sum of prime factors then it prints 1 as a given no. is a boston no.
{              
System.out.println("1");
}

else           // 0 as a given number is not a boston number
{
System.out.println("0");
}
	}
	
public static int is_boston_number(int N) //Function for calculating prime factor of a given number
{

int i=2;
int PF=0;

while(i<=N)
{

if(N%i==0)
{
PF= PF+sum_of_digit(i); // calling a function of sum of digit to calculate sum of digit of i(prime factor)
N=N/i;
}

else
{
i++;
}
}
return PF; // return sum of digit of prime factors
}

public static int sum_of_digit(int num) //For calculating of sum of digit of prime factors 
{                                       // And also for calculating sum of digits of a given number
int sum=0;
while(num>0)
{
int rem=num%10;
sum=sum+rem;
num=num/10;
}
return sum; 
}
}
