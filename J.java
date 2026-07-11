import java.util.*;
class J
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
			min2=min1;
			 min1=a[i];
			}
			else if(a[i]<min1 && a[i]>min2)
			{
				min2=a[i];
			}
		}
		System.out.print("min2 ele is:"+min2);
	}
}