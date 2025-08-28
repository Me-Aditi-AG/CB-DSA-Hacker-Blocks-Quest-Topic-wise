package Lec5_LoopQues;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// LCM: Stands for Least common multiple means . It means there is a lowest number which is divisible by both the numbers given by user
// Eg : User give 4 and 5 to calvulate LCM . Hence for this 20 is the lowest no. which is divisible by both 4 and 5
// Formula to calculate LCM : GCD * LCM = a *b : (LCM = a*b)/GCD
Scanner sc= new Scanner(System.in);

int dividend = sc.nextInt(); // taking dividend for calculating GCD fisrt and then taken as a first number to calculate LCM also
int divisor = sc.nextInt();  // taking divisor for calculating GCD fisrt and then taken as a first number to calculate LCM also
int a= dividend; // Storing intial value of dividend bcoz after loop will start dividend will change so intial value of dividend will lost
int b= divisor; // Storing intial value of divisor bcoz after loop will start divisor will change so intial value of divisor will lost

while(dividend % divisor !=0) // Loop for calculating GCD first 
{

int rem= dividend % divisor;
dividend = divisor;
divisor= rem;

}

int GCD = divisor;  // Then store last value of divisor value in which rem =0 and loop will got terminated in variable GCD
int LCM = (a*b)/GCD; // Here calculating LCM

System.out.println(LCM);
	}

}
