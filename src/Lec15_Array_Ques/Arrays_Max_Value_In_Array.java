package Lec15_Array_Ques;
import java.util.*;
public class Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt(); // Taking N as the size of array

int[]arr=new int[N];
for(int i=0;i<N;i++)
{
arr[i]=sc.nextInt();
}

System.out.println(max(arr));
	}

public static int max(int[]arr)
{

int prev=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++)
{
prev= Math.max(prev,arr[i]);
}

return prev;
}
}
