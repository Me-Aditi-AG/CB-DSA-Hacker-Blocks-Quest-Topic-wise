package Lec15_Array_Ques;
import java.util.*;
public class Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Concept similar to inverse of a number
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int[]arr= new int[N];
for(int i=0;i<N;i++)
{
arr[i]=sc.nextInt();
}

int [] ans = inverse(arr);

for(int i=0;i<ans.length;i++)
{
System.out.print(ans[i]+" ");
}
	}

public static int[] inverse(int[]arr) // Here returning temp[] array which stores the inverse values of arr[] array
{
int N=arr.length;
int pos= arr.length-1; // To keeping track of index no. arr array
int [] temp =new int[N]; // Creating new array temp which stores inversed value of arr

for(int i=arr.length-1; i>=0;i--) 
{
int val=arr[i];  // storing index value of arr array in val
                // Eg ; whehn i=4 : val = 4th index value which is 3
temp[val]=pos;  // then at new array temp at 3rd index temp[3] = pos4 : So at temp[3]=4
pos--;
}

return temp;
}
}
