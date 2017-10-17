//### [Challenge Name: Day 10: Binary Numbers](/challenges/30-binary-numbers)
//
//
//**Objective**	 
//Today, we're working with binary numbers. Check out the [Tutorial](/challenges/30-binary-numbers/tutorial) tab for learning materials and an instructional video!	
//
//**Task**	
//Given a base-$10$ integer, $n$, convert it to binary (base-$2$). Then find and print the base-$10$ integer denoting the maximum number of consecutive $1$'s in $n$'s binary representation.
package decimal2binary;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,max=1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a no:");
		int n=s.nextInt();
		Binary obj=new Binary();
		String b=obj.binary(n);	
		for(int i=0;i<b.length()-1;i++)
        {
            if(Character.getNumericValue(b.charAt(i))==1 )
            {
            	
            	if(Character.getNumericValue(b.charAt(i+1))==1)
            	{
            		count++;
            		if(count>max)
            		{
            			max=count;
            		}
            	}
            }
            else
            {
            	count=1;
            }
            
        }
        System.out.print("max no of ones:"+max);
		System.out.print("\n"+b);
	}
	String binary(int x)
	{
		if(x>0)
		{
			int a=x%2;
			x/=2;
			return binary(x)+""+a;
		}
		return "";
	}
	
}
