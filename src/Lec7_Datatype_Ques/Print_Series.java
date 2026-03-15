package Lec7_Datatype_Ques;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N1=sc.nextInt();
int N2=sc.nextInt();

int val=1;
int sum=0;
int count=0; // For keeping track to print numbers till the value of N1 ; here N1=10 so series print 10 numbers

while(count<N1)
{

sum= (3*val)+2;

if(sum%N2 !=0) // For checking the number is not a multiple of N2 : here N2=4 so checking each no is it divided by 4 or not
{
System.out.println(sum);
count++;
}

val++;
}


	}

}
