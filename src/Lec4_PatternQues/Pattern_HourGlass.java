package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// N=5 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int row=1;
int space=0;
int star=2*N+1; // bcoz in row1 there is 11 stars
int count=N; //For keeping the track of star part every row's pos1 bcoz after every row change pos1 value of each row cahnges
            //If i take this inside then after evry row change count set to its intialized value 
while(row<=2*N+1)  //Loop for total no. of rows : there are 11 rows so in N terma :2*N+1=2*5+1=10+1=11
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
int val=count; // val stores the value of count for every rows pos1 after that it will inc or dec acc. to loop
while(j<=star) // Loop for task 2 in first row which is for number
{
System.out.print(val +" ");

if(j<=star/2) //Vertical mirroring at col6
{             // till col5 val value dec after that it start inc
val--;       // So Eg; for row2 there are 9 numbers till j=4 it will dec bcoz at j4 we do prep for j5
}

else
{
val++;
}

j++;
}

if(row<=N) //Horizontal mirroring at row6
{          // so till row5 we dec star , inc space and dec count bcoz ar row5 we do the prep for row6
space++;
star-=2;
count--;
}

else
{
space--;
star+=2;
count++;
}

row++;  // Step3 : Next row prep
System.out.println();
}
	}

}
