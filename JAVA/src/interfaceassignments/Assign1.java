package interfaceassignments;
interface One
{
	abstract void showFirstName(String name);
}
class Two implements One
{
	public void showFirstName(String name)
	{
		System.out.println(name);
	}
}
class Three extends Two
{
	{
		System.out.println("Veera");
	}
}

class Four extends Three
{
	{
		System.out.println("mayu");
	}
}
public class Assign1 {

	public static void main(String[] args) {
		Four t=new Four();
		t.showFirstName("Mani");
	}

}
