package Lec7_Datatype_Ques;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int pos=0; // Keeping the track of 2^0 , 2^1, 2^2.....
int val=0;

while(N>0)
{

int rem= N%10; // Getting last digit of binary number
val= (int) (val + rem*Math.pow(2, pos)); // Eg: val= 0(prev val value) + 1*2^1 =0+2=2
pos++;
N=N/10;
}

System.out.println("Conversion of given binary number from binary to decimal is " + val);
	}

}
