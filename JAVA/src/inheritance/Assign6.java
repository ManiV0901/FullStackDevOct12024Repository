package inheritance;

class Laptop
{
	Laptop (String LaptopName1 ) 
    {
        System.out.println("Laptops:"+"  "+LaptopName1);
    }
	Laptop (String LaptopName1, String LaptopName2 ) 
    {
        System.out.println(LaptopName1+"  "+"Laptops:"+"  "+LaptopName2);
    }
}

class LaptopCharger extends Laptop 
{
	LaptopCharger(String LaptopName1)
	{
		super(LaptopName1);
	}
	LaptopCharger(String LaptopName1, String LaptopName2  )
	{
		super(LaptopName1+"  "+"Laptops:"+"  "+LaptopName2);
	}
}

class LaptopVersion extends Laptop
{
	LaptopVersion(String LaptopName1)
	{
		super(LaptopName1);
	}
	LaptopVersion(String LaptopName1, String LaptopName2  )
	{
		super(LaptopName1+"  "+"Laptops:"+"  "+LaptopName2);
	}
    
}

public class Assign6 {

	public static void main(String[] args) {
		LaptopCharger c=new LaptopCharger("LENOVO");
		LaptopCharger c1=new LaptopCharger("HP","ASUS");
		LaptopVersion v=new LaptopVersion("DELL");
		LaptopVersion v1=new LaptopVersion("MAC","APPLE");
		
	}

}
