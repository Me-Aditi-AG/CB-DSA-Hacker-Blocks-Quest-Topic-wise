package Lec6_Loops_Ques;

import java.util.Scanner;

public class Revising_Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d= (b*b)- 4*a*c;


		if(d>0)
		{
		int R1 = (int) ((-b - Math.sqrt(d)) / (2 * a));
		int R2 = (int) ((-b + Math.sqrt(d)) / (2 * a));
		if(R1>R2)
		{
		System.out.println("Real and Distinct");
		System.out.println(R2+" "+R1);
		}
		else
		{
		System.out.println("Real and Distinct");
		System.out.println(R1+" "+R2);
		}
		}

		else if(d==0)
		{
		int R1=(-b+d)/2*a;
		System.out.println("Real and Equal");
		System.out.println(R1+" "+R1);
		}

		else
		{
		System.out.println("Imaginary");
		}
	}

}
