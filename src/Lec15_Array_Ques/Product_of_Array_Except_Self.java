package Lec15_Array_Ques;
import java.util.*;
public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int []arr= new int[N];
for(int i=0; i<N;i++)
{
arr[i]=sc.nextInt();
}

int[] ans = product(arr);
for(int i=0; i<ans.length;i++)
{
System.out.print(ans[i]+" ");
}
	}

public static int[] product(int[]arr)
{
int N= arr.length;

int []left= new int[N];
left[0]=1;

for(int i=1;i<N;i++)
{
left[i]= left[i-1]*arr[i-1];
}

int []right= new int[N];
right[N-1]=1;

for(int i=N-2;i>=0;i--)
{
right[i]= right[i+1]*arr[i+1];
}

for(int i=0;i<N;i++)
{
left[i]= left[i]*right[i];
}

return left;
}
}
