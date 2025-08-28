package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_With_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;
int count=1; //For keeping the track of every row's pos1 bcoz after every row change pos1 value of each row inc
             //If i take this inside then after every row change count set to its intialized value 
while(row<=N)  //Loop for total no. of rows
{

int i=1; // Loop for task 1 in first row which is for numbers
while(i<=star)
{

if(i==1 || i==star) //Bcoz at every rows pos1 and lastpos acc. to its star value it print count value otherwise it prints 0
{
System.out.print(count+" ");
}

else
{
System.out.print("0 ");
}

i++;
}

row++; // Step3 : Next row prep
System.out.println();
star++;
count++;
}
	}

}
