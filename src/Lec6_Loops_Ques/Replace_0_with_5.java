package Lec6_Loops_Ques;
import java.util.*;
public class Replace_0_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();

		int pos=0;
		int val=0;
		while(N>0)
		{

		int rem= N%10;

		if(rem==0) // checking if digit value is equal to zero or not ; if it equal to 0 then change it to 5
		{
		rem=5;
		}
		
		val= (int) (val+ rem* Math.pow(10, pos));
		pos++;

		N=N/10;
		}
		
		System.out.println(val);
	}

}
