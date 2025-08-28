package Lec4_PatternQues;

import java.util.Scanner;

public class Hollow_Rohombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1; //for row1 space=4

while(row<=N)  //Loop for total no. of rows
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print(" ");
i++;
}

int j=1;
while(j<=N) // Loop for task 2 in first row which is for stars
{

if(row==1 || row==N) // bcoz in ro1 and row5 there are only stars but from row2 to row4 there are star only on pos1 and pos5 otherwise spaces b/w them
{
System.out.print("*"); //And we are not adding any space after * bcoz in row1 and row5 there is no space b/w stars
}


else
{

if(j==1 || j==N) //condition for row2 to row4 bcoz theer are stars only on pos1 and pos5
{
System.out.print("*");
}

else
{
System.out.print(" ");
}
}

j++;
}

row++; // Step3 : Next row prep
System.out.println();
space--;

}
	}

}
