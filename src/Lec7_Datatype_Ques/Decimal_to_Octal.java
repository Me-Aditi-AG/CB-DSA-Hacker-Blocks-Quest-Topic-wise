package Lec7_Datatype_Ques;

import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int val=0;
int pos=0; // Keeping the track of 10^0, 10^1 , 10^2 to write reverse of remainders while doing conversion

while(N>0)
{
	
int rem= N%8;
val= (int) (val+rem*Math.pow(10, pos));
pos++;
N=N/8;
}

System.out.println("Conversion of given decimal number into octal is " + val);
	}

}
