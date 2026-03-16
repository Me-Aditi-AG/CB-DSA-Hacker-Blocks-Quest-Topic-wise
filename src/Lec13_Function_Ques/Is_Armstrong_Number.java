package Lec13_Function_Ques;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

System.out.println(isarmstrong(N));
	}

public static boolean isarmstrong(int N) //Calling function isarmstrong and passing the value of N
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
return true;
}

else
{
return false;
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


