package Lec5_LoopQues;
import java.util.*;
public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime no. is a no. which is only divisible by 1 or itself
		Scanner sc = new Scanner (System.in);
		int N= sc.nextInt();

		int i=2; // i is intialized by 2 bcoz  1 and N is already a factor which can divide N 
		         //so if we start i by 2 till goes to N-1
		 
		int fact=0;
		while(i<N)
		{

		if(N%i==0) // then if any of the i divides N then fact increased 
		{         //means we found the one factor which divides N then loop will terminates due to using break statement.  
		fact++;
		break; // using break statement bcoz iof we found 1 factor that means the given njo. is not prime so theer si no benefit to found more factors 
		       //So by using break whole loop will get terminated
		}

		i++;
		}

		if(fact>=1) // if we found only 1 factor then that means no. is not a prime no.
		{
		System.out.println("Not Prime");
		}

		else
		{
		System.out.println("Prime");
		}
	}

}
