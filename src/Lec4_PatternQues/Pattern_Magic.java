package Lec4_PatternQues;
import java.util.*;
public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N=5 which is given in pattern Ques
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		int row=1;
		int star=N;
		int space=-1;

		while(row<=2*N-1)  //Loop for total no. of rows
		{

		int i=1; //Loop for first part
		while(i<=star) // Loop for task 1 in first row which is for stars
		{
		System.out.print("*"); //Acc. to pattern there is no space b/w stars
		i++;
		}

		int j=1; //Loop for mid part
		while(j<=space) // Loop for task 2 in first row which is for space
		{
		System.out.print(" ");
		j++;
		}

		int k=1; //Loop for last part
		if(row==1 || row==2*N-1 ) //In last part due to k<=star : theer is extra star bcoz in first and last row of last part there will be only 4 stars but to this loop it will print 5 stars
		{
		k=2; // So k set to 2 due to this k<=star : 2<=5 : loop will work onloy 4 times so only 4 stars will print
		}

		while(k<=star) // Loop for task 3 in first row which is for stars
		{
		System.out.print("*");
		k++;
		}

		if(row<N) //Horizontal mirroring at row5
		{         // Till row4 we dec star and inc space bcoz at row4 we do prep for row 5
		star--;
		space+=2;
		}

		else
		{
		star++;
		space-=2;
		}

		row++;
		System.out.println();
		}

	}

}
