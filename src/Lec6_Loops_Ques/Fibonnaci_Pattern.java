package Lec6_Loops_Ques;

import java.util.Scanner;

public class Fibonnaci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;
int a=0;
int b=1;

while(row<=N)
{
	
int i=1;
while(i<=star)
{
	
System.out.print(a+" ");
int c=a+b;
a=b;
b=c;

i++;

}

row++;
System.out.println();
star++;
}
	}

}
