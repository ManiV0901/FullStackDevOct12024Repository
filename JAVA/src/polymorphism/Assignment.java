package polymorphism;
abstract class Cities
{
	abstract void city();
}
class First extends Cities
{
	void city()
	{
		String s="Ymg";
		System.out.println("City Name is:"+s);
	}
}
class Second extends Cities
{
	void city()
	{
		String s="Knl";
		System.out.println("City Name is:"+s);
	}
}
class Third extends Cities
{
	void city()
	{
		String s="Adn";
		System.out.println("City Name is:"+s);
	}
}

class Fourth extends Cities
{
	void city()
	{
		String s="raichur";
		System.out.println("City Name is:"+s);
	}
}
public class Assignment {

	public static void main(String[] args) {
		Cities c=null;
		First f=new First();
		Second s=new Second();
		Third t=new Third();
		Fourth ft=new Fourth();
		c=f;
		c.city();
		c=s;
		c.city();
		c=t;
		c.city();
		c=ft;
		c.city();
	}

}
