import java.util.*;

class BatterUp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int[] arr= new int[n];
		double denominator=0;
		double sum=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(!(arr[i]== -1))
				{
					denominator++;
				}
			if(arr[i]== -1)
				{
					arr[i]=0;;
				}	
				sum+=arr[i];
		}
		double slug=sum/denominator;
		
		System.out.println((double)slug);
	}
}