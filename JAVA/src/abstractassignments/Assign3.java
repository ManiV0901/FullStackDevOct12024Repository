package abstractassignments;
abstract class Demo
{
	static
	{
		System.out.println("Ya its me");
	}
	static
	{
		System.out.println("Ya Ya its me");
	}
}
class Dem extends Demo
{
	void show()
	{
		System.out.println("ok let it be");
	}
}
public class Assign3 {

	public static void main(String[] args) {
		Demo a=new Dem();
		Dem b=new Dem();
		b.show();
	}

}
