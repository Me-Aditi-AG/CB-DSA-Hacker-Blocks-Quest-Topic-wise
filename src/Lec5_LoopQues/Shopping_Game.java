package Lec5_LoopQues;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int T=sc.nextInt();

int i=0;

while(i<T) //For taking 2 times inputs of M and N
{
	
int M=sc.nextInt(); // Maximum limit of aayush
int N=sc.nextInt(); // Maximum limit of harshit

int count=1; //For tracking their purchase of pohones
int asum=0;
int hsum=0;

while(true) // Whenever one of the if condition got true then loops ends by printing who wins
{

asum= asum+count;
if(asum>M) // if maximum limit of aayush got reached then print harshit as winner
{
System.out.println("Harshit");
break;
}

count++;
hsum= hsum+count;
if(hsum>N) // if maximum limit of harshit reached then print aayush as winner
{
System.out.println("Aayush");
break;
}

count++;
}

i++;
}
	}

}
