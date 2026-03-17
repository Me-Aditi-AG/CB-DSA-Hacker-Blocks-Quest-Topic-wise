package Lec13_Function_Ques;

import java.util.Scanner;

public class Chewbacca_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
long x=sc.nextLong();

System.out.println(is_chewbacca(x));
	}

public static long is_chewbacca(long N)
{

long pos=0;
long num=0;

while(N>9)
{
long t=N%10;
long rem= 9-t;

if(rem<t)
{
num=(long) (num+ rem*Math.pow(10, pos));
}

else
{
num=(long) (num+ t*Math.pow(10, pos));
}

pos++;
N=N/10;
}
if(N==9 || N<=4)
{
num=(long) (num+ N*Math.pow(10, pos));
}
else
{
num=(long) (num+ (9-N)*Math.pow(10, pos));
}

return num;
}
}
