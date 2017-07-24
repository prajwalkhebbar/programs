package armstrong;
import java.util.*;
public class Armstrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,s=0;
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int m=n;m>0;m/=10)
		{
			d=m%10;
			s+=Math.pow(d,3);
		}
		if (n==s)
		{
			System.out.println("the no is an armstrong no");
		}
		else
		{
			System.out.println("the no is not an armstrong no");
		}
		sc.close();

	}

}
