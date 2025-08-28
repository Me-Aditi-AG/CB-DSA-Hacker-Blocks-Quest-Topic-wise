package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// N=4 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;
int space=N+1; //Bcoz in row1 there is 5 spaces
int count=1; //For keeping the track of last part every row's pos1 bcoz after every row change pos1 value of each row cahnges
            //If i take this inside then after evry row change count set to its intialized value 
while(row<=N)  //Loop for total no. of rows
{

int i=1;  //Loop for first part
int val=1; //bcoz for evry row change pos1 of first part set 1 then its start inc for that roop acc. to loop
while(i<=star)// Loop for task 1 in first row which is for numbers
{
System.out.print(val +" ");
val++;
i++;
}

int j=1;  //Loop for mid part
while(j<=space)  // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;       // Loop for last part
int num=count; //Num stores the value of count bcoz for last part pos1 then after that it will dec for that row
if(row==N)  // Bcoz in last row there will extra no. bcoz of loop of k<=star: star=4: so acc. to taht there will eb 4 no.'s but we need 3
{          //So for that k=2 then acc. to k<=star: 2<=4 : 3 no.'s will print acc.to loop
k=2;      // Acc. to first part of last row loop 4 will already got printed and due to count value for the last part of last row count will aldso print 4
num=N-1; // But acc. to pattern we need 3 there will be no repetition in pattern so num will set to N-1 for that row
}
while(k<=star) // Loop for task 3 in first row which is for numbers
{
System.out.print(num +" ");
num--;
k++;
}

row++;  // Step3 : Next row prep
System.out.println();
star++;
space-=2;
count++;
}
	}

}
