package interfaceassignments;
interface Demo
{
	abstract void showFirstName(String name);
}
interface Demo1
{
	abstract void showFirst(String name);
}
interface Demo2
{
	abstract void show(String name);
}
class Demo4 extends Demo5 implements Demo,Demo1,Demo2
{
	public void showFirstName(String name)
	{
		System.out.println(name);
	}
	public void showFirst(String name)
	{
		System.out.println(name);
	}
	public void show(String name)
	{
		System.out.println(name);
	}
}
class Demo5
{
	void Display()
	{
		System.out.println("heeeeee it mani ,nice to meet you");
	}
}
public class Assign2 {

	public static void main(String[] args) {
		Demo4 d=new Demo4();
		d.Display();
		d.showFirstName("Mani");
		d.showFirst("mayu");
		d.show("Somu");
	}

}
