package Lec7_Datatype_Ques;

import java.util.*;
public class Lowe_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);

char ch= sc.next().charAt(0); // Syntax for taking char as input

if(ch >='a' && ch <='z') // due to taking char ch as input then there is no need to write all the alphabets
{
System.out.println("lowercase");
}

else if(ch>='A' && ch<='Z')
{
System.out.println("UPPERCASE");
}

else
{
System.out.println("Invalid");
}
	}

}
