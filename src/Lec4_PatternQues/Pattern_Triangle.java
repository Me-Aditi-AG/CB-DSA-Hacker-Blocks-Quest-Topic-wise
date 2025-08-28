package Lec4_PatternQues;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=4 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int num=1;

while(row<=N)  //Loop for total no. of rows
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
int val=row; // Here val stores the value of row bcoz after every row change the pos1 of each row is equals to the value to that row
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print(val+" ");

if(j<=num/2) //Vertical mirroring at col4
{            //Eg: In row3 there are 5 no.'s and val inc till j3 and after it starts dec so till j2 which is star/2=5/2=2.5=2 we inc the val 
val++;       // Bcoz at j2 we do the prep for j3
}

else
{
val--;
}

j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
num+=2;
}
	}

}
