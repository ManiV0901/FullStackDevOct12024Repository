package abstractassignments;
abstract class Mobiles
{
	String name;
	int amount;
	void showdata(String name,int amount)
	{
		System.out.println("Name :"+name +"  "+"Amount:"+amount);
	}
}
class Phones extends Mobiles
{
	void show()
	{
		System.out.println("Mobile is available");
	}
}
public class Assign5 {

	public static void main(String[] args) {
		Mobiles p=new Phones();
		p.showdata("Vivo", 20000);
		Phones p2=new Phones();
		p2.show();
	}

}
