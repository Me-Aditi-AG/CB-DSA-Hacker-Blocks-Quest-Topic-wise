package Lec6_Loops_Ques;

import java.util.Scanner;

public class Odd_And_Even__In_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int t=0;

while(t<N) // loop if for taking multiple input till the value of N : if N=2 so we take 2 inputs but first we check for input1 then for input2
{
int N1=sc.nextInt();

int evensum=0;
int oddsum=0;
while(N1>0)
{

int rem=N1%10;

if(rem%2==0) // Checking if digit of a number is even then add into evensum otherwise add into oddsum
{
evensum=evensum+rem;
}

else
{
oddsum=oddsum+rem;
}

N1= N1/10;
}

if(evensum%4==0 || oddsum%3==0) // After getting evensum and oddsum then check the condition if thats true then car is allow in delhi
{
System.out.println("Yes");
}

else
{
System.out.println("No");
}

t++;
}
	}

}
