package Lec5_LoopQues;
import java.util.*;
public class Print_Reverse_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For calculating the reverse of the no.
		// Eg : N= 12345 : Reverse = 54321

		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		while(N>0)
		{
		int rem= N%10; //For calculating the last didgit of the number
		System.out.print(rem); // After getting the last digit if no. every time then it will print first as rem
		N=N/10; // Getting the next upcoming no. after getting last digit as rem
		}
	}

}
