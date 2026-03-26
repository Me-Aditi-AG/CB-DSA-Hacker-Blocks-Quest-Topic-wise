package Lec15_Array_Ques;

import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();  // Taking N as a size of array

int[]arr=new int[N];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

int M=sc.nextInt(); // Taking M as number which need to be find in array

System.out.println(Linear_search(arr,M));
	}

public static int Linear_search(int[]arr, int M)
{

int item=M;

for(int i=0;i<arr.length;i++)
{
if(arr[i]==item)
{
return i;
}
}

return -1 ;
}
}
