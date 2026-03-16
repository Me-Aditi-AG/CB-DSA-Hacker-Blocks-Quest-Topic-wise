package Lec6_Loops_Ques;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Mentioned formula to use is(5/9)*(F-32) but if we use this formula then we get C=0 
//Bcoz first we need to typecast to int bcoz after calculating C we got decimal values and we can print that acc. to ques
//So 5/9=0.5555 after typecast to int we get o and (5/9)*(F-32)=0*(F-32)=0 for every conversion
// So here we use (5.0/9)*(F-32);5.0 is in double so if we typecast it it doesn't change
//otherwise we can use (5*(F-32))/9

Scanner sc= new Scanner(System.in);

int min=sc.nextInt(); // minimum fahrenheit value
int max=sc.nextInt(); //maximum fahrenheit value
int step=sc.nextInt();

int F=min;
while(F<=max)
{

int C= (int)((5*(F-32))/9); 
System.out.println(F+" "+C);
F=F+step;
}
	}

}
