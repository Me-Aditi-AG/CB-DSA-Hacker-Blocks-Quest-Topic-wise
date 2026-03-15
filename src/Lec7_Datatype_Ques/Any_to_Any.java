package Lec7_Datatype_Ques;

import java.util.Scanner;

public class Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int sb= sc.nextInt();  // sb= source base ; here sb=8
int db= sc.nextInt();  // db= destination base ; here db= 2
int sn= sc.nextInt();  // sn= source number ; here sn= 33

// In any to any conversion first we need to convert source base number to decimal base then decimal base number to destination base number
// We do this when one of the base is not 10 in conversion : here sb= 8 and db= 2
// Loop for converting sb to 10 base means here converting octal base no.(33) to decimal base which is 27

int pos=0;  
int val=0;
while(sn>0)
{

int rem= sn%10;
val= (int) (val+ rem*Math.pow(sb, pos));
pos++;
sn= sn/10;
}

// loop for converting decimal base number 27 to destination base(2) number which is 11011
int total = val;
int sum=0;
int count=0;
while(total>0)
{

int num= total%db;
sum= (int) (sum+ num* Math.pow(10, count));
count++;
total= total/db;
}

System.out.println("Destination number after conversion is " + sum);

	}

}
