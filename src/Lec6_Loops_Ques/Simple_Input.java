package Lec6_Loops_Ques;
import java.util.*;
public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc= new Scanner(System.in);
int sum=0;

while(true) // Due to this we will be able to take multiple inputs till condition got false
{
	
int N= sc.nextInt();

sum = sum+N;

if(sum<0) // here if sum<0 got true due to break whole loop ends and it doesn't print input and didn't take more inputs
{
break;
}

System.out.println(N);
}
	}

}
