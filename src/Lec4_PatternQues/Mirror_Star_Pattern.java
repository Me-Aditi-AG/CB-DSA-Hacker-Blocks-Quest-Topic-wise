package Lec4_PatternQues;
import java.util.*;
public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N=5 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N/2;
int star=1;

while(row<=N)  //Loop for total no. of rows
{
	
int i=1;
while(i<=space) // Loop for task 1 in first row which is for space{
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star) // Loop for task 2 in first row which is for stars
{
System.out.print("* ");
j++;
}

if(row<=N/2) //Mirroring at row3
{            // So till row2 we dec space and inc star bcoz at row2 we do prep for row3
space--;
star+=2;
}

else
{
space++;
star-=2;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
