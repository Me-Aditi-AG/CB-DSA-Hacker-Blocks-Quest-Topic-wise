package Lec4_PatternQues;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N=5 which is given in pattern Ques
		
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		int row=1;
		int star= N/2+1;
		int space= -1;

		while(row<=N) //Loop for total no. of rows
		{

		int i=1; // Loop for first part
		while(i<=star) //Loop for task1 in row1
		{
		System.out.print("* ");
		i++;
		}

		int j=1; // Loop for mid part
		while(j<=space) //Loop for task2 in row1
		{
		System.out.print("  ");
		j++;
		}

		int k=1; //Loop for last part
		if(row==1 || row==N) // This condition used here bcoz of extra star in last part of row1 and row5
		{                    // When star is printing for last part of row1 and row then k=2
		k=2;                 // Bcoz due to this loop will work only 2 time rather than working 3 times
		}                    // k<=star : 2<=3 : so it work for when k=2 and k=3

		while(k<=star) // Loop for task3 in row1
		{
		System.out.print("* ");
		k++;
		}

		if(row<=N/2) //Mirroring line is row3
		{            // So till row2 we dec star and inc star bcoz at row2 we do the prep for row3
		star--;
		space+=2;
		}

		else
		{
		star++;
		space-=2;
		}

		row++;  //Next Row Prep
		System.out.println();
		}
	}

}
