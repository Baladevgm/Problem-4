import java.util.*;
class  Problem_4
{
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		int a[]= {1,2,8,9,12,46,76,82,15,20,30};
		System.out.println("answer is........");
		int res[]=new int[9];
		int k=0;
		for(int i=1;i<=9;i++)
		{
			int count=0;
		   for(int j=0;j<=10;j++)
			{
				if(a[j]%i==0)
				{
				count++;
				}
			}
			res[k]=count;
			k++;
		}
		for(int i=0;i<=res.length-1;i++)
		{
	System.out.println("{"+(i+1)+":"+res[i]+"}");
		}
	}
}