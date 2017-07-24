package simplefunoverriding;
class iphone extends Phones{
	void show()
	{
		System.out.println("crappy iphones");
	}
}
class android extends Phones{
	void show()
	{
		System.out.println("great android os");
	}
}
public class Phones {
	void show()
	{
		System.out.println("this is the phone class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phones i;
		i=new android();
		i.show();
		i=new iphone();
		i.show();
		

	}

}
