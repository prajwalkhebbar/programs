package arrdup;
import java.util.*;
public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=0;
		System.out.println("enter the size of the array\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			int j=i;
			while(j>0)
			{
				if(a[i]!=a[j-1])
				{
				}
				else
				{
					System.out.println("the no "+a[i]+" is repeated @ "+(i+1));
					k=1;
				}
				j--;
				
			}
		}
		if(k==0)
		{
			System.out.println("the array is unique");
		}

	}

}
