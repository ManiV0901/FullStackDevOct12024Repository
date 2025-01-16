package inheritance;

class Simcards
{
	void Card1(String card)
	{
		System.out.println("Displaying the sim card:"+card);
	}
}
class Simcard1 extends Simcards
{
	void Card2(String area)
	{
		System.out.println("Displaying the sim card:"+area);
	}
}
class Simcard2 extends Simcards
{
	void Card3(String recharge)
	{
		System.out.println("Displaying the sim card:"+recharge);
	}
}
public class Assign3 {

	public static void main(String[] args) {
		Simcard1 sc=new Simcard1();
		sc.Card1("Jio");
		sc.Card2("Bengalur");
		
		Simcard2 sc1=new Simcard2();
		sc.Card1("Jio");
		sc1.Card3("Balance is available");
	}

}
