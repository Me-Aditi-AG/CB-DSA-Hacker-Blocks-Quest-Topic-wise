package Lec15_Array_Ques;
import java .util.*;
public class Arrays_Reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N= sc.nextInt(); // Taking N as size of array

int[]arr= new int[N];
for(int i=0;i<N;i++) // Taking input for each index of array
{
arr[i]=sc.nextInt();
}

reverse(arr);

for(int i=0;i<N;i++)  // Printing reverse array
{ 
System.out.println(arr[i]+" ");
}
	}
	
public static void reverse(int[]arr)
{
int i=0;
int j=arr.length-1;

while(i<j)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;

i++;
j--;
}

}
	}


