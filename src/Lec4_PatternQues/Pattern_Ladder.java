package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// N=5 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;
int val=1; //Intialization of val outside of the loop bcoz for only pso1 it sets to 1 after taht val will inc acc. to loop and prints
          // If i take this inside the loop then it will set to 1 after every row change
while(row<=N)  //Loop for total no. of rows
{
int i=1;
while(i<=star) // Loop for task 1 in first row which is for numbers
{
System.out.print(val +" ");
val++;
i++;
}

row++; // Step3 : Next row prep
System.out.println();
star++;
}
	}

}
