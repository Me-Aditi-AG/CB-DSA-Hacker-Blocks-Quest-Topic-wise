package Lec13_Function_Ques;

import java.util.Scanner;

public class Chewbacca_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
long x=sc.nextLong(); //Acc. to ques condition input should be in long

System.out.println(is_chewbacca(x));
	}

public static long is_chewbacca(long N) //Function to make chewbacca number
{

long pos=0;
long num=0;

while(N>9) // Acc. to ques if after doing invert and all if starting number of a given number is 9 then don't make it 0
{         // Bcoz number starting with 0 like 039 is not a decimal number it count as octal number
long t=N%10;
long rem= 9-t; // Thats how we calculate another number for invert

if(rem<t) // If 9-t number is less than orignal number then replace it bcoz chewbacca is to make minimum number
{         // Eg orignal number is 5 then after 9-t= 9-5=4 and 4<orignal number 5 so we can replace 5 with 4
num=(long) (num+ rem*Math.pow(10, pos));
}

else
{
num=(long) (num+ t*Math.pow(10, pos)); // if 9-t> orignal number then don't replace and print as it is
}

pos++;
N=N/10;
}
if(N==9 || N<=4) //For handling the leading 9 in given number then we print as it is the given number 9
{                // also from 4 to 0 we can't replace bcoz 9-t=9-4=5 which is 5>orignal number 4
num=(long) (num+ N*Math.pow(10, pos));
}
else
{
num=(long) (num+ (9-N)*Math.pow(10, pos)); //but if leading number is greater than 4 then we do 9-N(N=given leading number)
}

return num;
}
}
