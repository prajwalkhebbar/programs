package funoverride;
import java.util.*;
 class Prg {
	String name;
	int salary;
	double interest;
	void  display()
	{
		System.out.println("name:"+name+"\n interest: "+interest);
	}
	void input()
	{
		System.out.println("enter the name and salary");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		salary=sc.nextInt();
		sc.close();
	}
	void output()
	{
		
	}
}
	class developer extends Prg
	{
		developer()
		{
			interest=4.05;
			salary=20999;
		}
		 void output()
		 {
			 System.out.println("salary is "+salary+" interest is "+interest);
		 }
		
	}
	class programmer extends Prg
	{
		programmer()
		{
			interest=6;
			salary=99868;
		}
		void output()
		 {
			 System.out.println("salary is "+salary+" interest is "+interest);
		 }
	}
public class Emp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prg ob=new Prg();
		ob.input();
		ob.display();
		ob=new developer();
		ob.output();

	}

}

