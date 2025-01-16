package inheritance;

class Mobiles 
{
	Mobiles (String MobilesOne ) 
    {
        System.out.println("Mobiles:"+"  "+MobilesOne);
    }
	Mobiles (String MobilesOne, String MobilesTwo ) 
    {
        System.out.println(MobilesOne+"  "+"Mobiles:"+"  "+MobilesTwo);
    }
}

class Charger extends Mobiles 
{
	Charger(String MobilesOne)
	{
		super(MobilesOne);
		System.out.println("Charger capacity 120W");
	}
	Charger(String MobilesOne,String MobilesTwo )
	{
		super(MobilesOne+"  "+"Mobiles:"+"  "+MobilesTwo);
	}
}

class Version extends Charger
{
	Version(String MobilesOne)
	{
		super(MobilesOne);
	}
	Version(String MobilesOne,String MobilesTwo )
	{
		super(MobilesOne+"  "+"Mobiles:"+"  "+MobilesTwo);
	}
    
}

public class Assign5 {

	public static void main(String[] args) {
		Version v=new Version("Redmi");
		Version v1=new Version("Vivo","Oppo");
		
	}

}
