package interfaceassignments;
interface First
{
	abstract void showFirstName(String name);
}
interface Second
{
	abstract void showFirst(String name);
}

class Third
{
	public void showFirstName(String name)
	{
		System.out.println(name);
	}
}
class Fourth extends Third implements First,Second
{
	public void showFirstName(String name)
	{
		System.out.println(name);
	}
	public void showFirst(String name)
	{
		System.out.println(name);
	}
}
public class Assign3 {

	public static void main(String[] args) {
		Fourth f=new Fourth();
		f.showFirstName("mani");
		f.showFirst("veera");
	}

}
