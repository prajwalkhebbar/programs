package citysort;
import java.util.Scanner;
public class Citysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the total no of cities ur going to enter \n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String ctnames[]=new String [n];
		for(int i=0;i<n;i++)
			
		{
			ctnames[i]=sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int r =ctnames[i].compareTo(ctnames[j]);
				if(r>0)
				{
					String t=new String(ctnames[i]);
					ctnames[i]=ctnames[j];
					ctnames[j]=t;
				}
			}

	}
		for(int i=0;i<n;i++)
		{
			System.out.println(ctnames[i]);
		}
		sc.close();

}
}
