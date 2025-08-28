package Lec4_PatternQues;
import java.util.*;
public class Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int Ospace=N-1; //Acc.to pattern there is 6 Outer space in row1 so in N term. N-1=7-1=6
int star=1;
int Mspace =-1; // Acc. to pattern there is mid space also
int count=1; // Here count is taken for keeping the track of pos1 of first part of row1 bcoz acc. to pattern count inc or dec by every row change
             // If i take count inside the loop so it will set to its initialized value after every row change
while(row<=N) // //Loop for total no. of rows
{

int i=1; //Loop for first part
while(i<=Ospace) // Loop for task 1 in first row which is for outer space
{
System.out.print("  ");
i++;
}
int j=1; //Loop for second part
int val=count; // Acc. to pattern after storing count value in val variable then it will dec in its row
               // That's why its taken inside the loop bcoz it will dec for every row
while(j<=star) // Loop for task 2 in first row which is for number
{
System.out.print(val +" ");
val--;
j++;
}

int k=1; //Loop for third part
while(k<=Mspace) //// Loop for task 3 in first row which is for mid space
{
System.out.print("  ");
k++;
}

int m=1; // loop for fourth part
int num=1; //here num taken inside the loop bcoz after every row change it has to be set to 1 acc. to apttern then it will inc acc. to loop

if(row==1 || row==N) // Bcoz at row1 and row2 extra number will print due to first part of the loop bcoz it prints the 1 acc.to its loop and also 1 again prints acc. to alst part
{
m=2;   //Bcoz of this m sets 2 due to this loop will not work m<=star : star=1 in row1 and row2 : So 2<=1 condition gets false : loop doesn't work
}

while(m<=star) // // Loop for task 4 in first row which is for number
{
System.out.print(num +" ");
num++;
m++;
}

if(row<=N/2) //Mirroring at row4
{           // So till row3 we dec outerspace, inc mid space , inc star and also inc count bcoz at row3 we do prep for row4
Ospace-=2;
star++;
Mspace+=2;
count++;
}

else
{
Ospace+=2;
star--;
Mspace-=2;
count--;
}

row++; //// Step3 : Next row prep
System.out.println();
}

	}

}
