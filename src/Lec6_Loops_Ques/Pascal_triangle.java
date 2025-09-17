package Lec6_Loops_Ques;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nCr = n! / (n-r)!*r!
		// nCr+1 = n! / (n-r+1)! *(r+1)!
		// Calculating nCr+1 formula from nCr bcoz to remove calculating formula
		// After dividing nCr+1 / nCr = formula occurs is ((n-r)*nCr) /(r+1) 
				
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		int row=0; //Here row starts from 0 and goes till 5 : acc. to thsi there are also loop will work for 6 rows
		int star=1;

		while(row<N) //Loop for total no. of rows
		{
			
		int i=0; //Loop for task1 of row1
		int val=1; //Intializing val by 1 bcoz for every row nC0 =1 : Eg: 4C0 =1 for row4 of pos0 (here pos starts with 0 means i starts with 0)

		while(i<star) //Bcoz for every row i will start from 0 thats why i<star
		{
		System.out.print(val+" ");

		val= ((row-i)*val)/(i+1); // formula using for nCr+1 which is formula driven by nCr+1 / nCr bcoz to remove calculating factorial 
		i++;
		}

		row++; //Next row prep
		System.out.println();
		star++;
		}
	}

}
