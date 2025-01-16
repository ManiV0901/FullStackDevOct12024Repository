package inheritance;

class Bis
{
	void BottleName(String bottlename)
	{
		System.out.println("WaterBottle:"+bottlename);
	}
}
class Bisleri extends Bis
{
	void showBottle(String bottlename)
	{
		super.BottleName(bottlename);
	}
}
class Kinley extends Bisleri
{
	void showBottleName(String name)
	{
		super.showBottle(name);
	} 
}

public class Assign7 {

	public static void main(String[] args) {
		Kinley k=new Kinley();
		k.BottleName("Water Bottle Name is Bisleri");
		k.showBottle("Water Bottle Name is Kinley");
		k.showBottleName("Water Bottle Name is Royal Stag");
	}

}
