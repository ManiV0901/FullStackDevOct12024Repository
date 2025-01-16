package inheritance;
class Clothing 
{
    void clothing(String Clothing1) 
    {
        System.out.println("Boys Clothing two categories:"+"  "+Clothing1);
    }
}

class Tshirts extends Clothing 
{
	Tshirts(String tshirts) 
    {
        System.out.println("T-Shirts: " + tshirts);
    }
}

class Shirts extends Tshirts 
{
	Shirts (String tshirts)
	{
		super(tshirts);
	}
    void shirts(String shirts) 
    {
        System.out.println("Shirts: " + shirts);
    }
}

public class Assign4 
{
    public static void main(String[] args) 
    {
    	Tshirts t=new Tshirts("Graphic T-Shirts");
    	t.clothing("Winter");
    	
        Shirts s = new Shirts("Graphic T-Shirts");
        s.shirts("Casual Shirts");
        s.clothing("Winter");
    }
}
