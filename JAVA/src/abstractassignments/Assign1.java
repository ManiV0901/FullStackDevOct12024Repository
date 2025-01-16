package abstractassignments;
abstract class One
{
	static
	{
		System.out.println("One");
	}
}
class Two extends One
{
	void show()
	{
		System.out.println("Two");
	}
}
public class Assign1 {

	public static void main(String[] args) {
		Two t=new Two();
		t.show();
	}

}
