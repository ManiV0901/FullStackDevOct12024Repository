package inheritance;

class SocialMedia
{
	void Platform(String Platformname)
	{
		System.out.println("Platformname is here displayed as:"+Platformname);
	}
}
class SocialMedia1 extends SocialMedia
{
	void Platform1(String Platformname)
	{
		super.Platform(Platformname);
	}
}
class SocialMedia2 extends SocialMedia
{
	void Platform2(String Platformname)
	{
		super.Platform(Platformname);
	} 
}

public class Assign8 {

	public static void main(String[] args) {
		SocialMedia1 sm=new SocialMedia1();
		sm.Platform("Instagram");
		sm.Platform1("Facebook");
		
		SocialMedia2 sm1=new SocialMedia2();
		sm1.Platform("Whatsaap");
		sm1.Platform2("Twitter");
	}

}
