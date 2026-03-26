package Lec15_Array_Ques;
import java.util.*;
public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int T =sc.nextInt();

while(T>0)  // Loop for tacking 2 inputs
{
int N=sc.nextInt();

int [] arr= new int[N];
for(int i=0;i<N;i++)
{
arr[i]=sc.nextInt();
}

rain_water(arr);
T--;
}

	}

public static void rain_water(int[]arr)
{
int N=arr.length;

int [] lmax= new int[N];

lmax[0]=arr[0];
for(int i=1; i<N;i++)
{
lmax[i]= Math.max(lmax[i-1], arr[i]);
}

int [] rmax= new int[N];

rmax[N-1]=arr[N-1];
for(int i=N-2;i>=0;i--)
{
rmax[i]= Math.max(rmax[i+1], arr[i]);
}

int sum=0;
for(int i=0;i<N;i++)
{
sum= sum+ (Math.min(lmax[i],rmax[i]))-arr[i];
}

System.out.println(sum);
}
}
