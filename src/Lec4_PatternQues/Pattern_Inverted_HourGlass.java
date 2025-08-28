package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_Inverted_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;
int space=2*N-1; //Bcoz in row1 there is 9 spaces
int count=N; //For keeping the track of last part every row's pos1 bcoz after every row change pos1 value of each row cahnges
//If i take this inside then after evry row change count set to its intialized value 
while(row<=2*N+1)  //Loop for total no. of rows
{

int i=1; //Loop for first part
int val=N; //Bcoz after every row change pos1 of every rows' in first part set to value of N=5 then after that its starts dec
while(i<=star) // Loop for task 1 in first row which is for star
{
System.out.print(val+" ");
val--;
i++;
}

int j=1;    //Loop for mid part
while(j<=space) // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;  //Loop for last part
int num=count;//num stores the value of copunt for getting pos1 value of every row then after this it will start inc acc. to loop for every row
if(row==N+1) //Bcoz in row6 in last part there is extra no. acc. to loop of k<=star : star=6 but there is 5 number to print 
{            // so k set to 2 then loop will work only 5 times not 6 bcoz k<=star : 2<=6 : 5 loops
k=2;
num=1;      // And also here num set to 1 bcoz acc. to count it will set to 0 but we need 1 here acc. to pattern bcoz acc. to first loop of star 0 is already got printd
}           // That's why num sets to 1 then acc. to loop it will inc for that row
while(k<=star) // Loop for task 3 in first row which is for star
{
System.out.print(num+" ");
num++;
k++;
}

if(row<=N) //Horizontal mirroring at row6
{          // so till row5 we inc star , dec space and dec count bcoz ar row5 we do the prep for row6
star++;
space-=2;
count--;
}

else
{
star--;
space+=2;
count++;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
