package abstractassignments;

abstract class Three
{
	{
		System.out.println("Three");
	}
}
class Four extends Three
{
	void show()
	{
		System.out.println("Four");
	}
}
public class Assign2 {

	public static void main(String[] args) {
		Four f=new Four();
		f.show();
	}

}
