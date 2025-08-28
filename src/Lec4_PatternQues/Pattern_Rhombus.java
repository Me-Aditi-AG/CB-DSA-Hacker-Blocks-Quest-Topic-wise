package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=3 which is given in pattern Ques
// In numerical pattern we can use both horizontal and vertical mirroring both
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int num=1;
int count=1; // for keeping the track of pos1 of every row after row change count for pos1 will inc and dec acc. to loop
             //didnt take inside the loop bcoz after every row change it will set to same
while(row<=2*N-1) // N=5 which is given in pattern Ques
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
int val=count;
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print(val +" ");

if(j<=num/2) // Vertical Mirroring at col3 
{            // till col3 val value inc after that it start dec
val++;      // So Eg; for row3 there are 5 numbers till j=2 it will inc bcoz at j2 we do prep for j3
}          

else
{
val--;
}

j++;
}

if(row<N) //Horizontal Mirroring at row3
{         // So till row2 we dec space and inc num bcoz at row2 we do prep for row3
space--;
num+=2;
count++;
}

else
{
space++;
num-=2;
count--;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
