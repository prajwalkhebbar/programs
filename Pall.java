package pallendrome;
import java.util.*;
public class Pall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=0,d,x=0,y;
		int a[]=new int[10];
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int m=n;m>0;m/=10)
		{
			d=m%10;
			a[i]=d;
			i++;
		}
		y=i-1;
		while(y>=x)
		{
			if(a[x]==a[y])
			{
				x++;
				y--;
			}
			else
			{
				System.out.println("the no is not a pallendrome ");
				break;
			}
			
		}
		if(y<x)
		{
			System.out.println("the no is a pallendrom");
		}

	}

}
