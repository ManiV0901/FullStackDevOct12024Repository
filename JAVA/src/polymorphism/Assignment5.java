package polymorphism;

abstract class Mobiles 
{
    abstract void mobile();
}

class Samsung extends Mobiles 
{
    void mobile() 
    {
    	String s="Samsung";
        System.out.println("Mobile Name is: "+s);
    }
}

class AppleIphonne extends Mobiles 
{
    void mobile() 
    {
    	String s="AppleIphonne";
        System.out.println("Mobile Name is: "+s);
    }
}

class Google extends Mobiles 
{
    void mobile() 
    {
    	String s="Google";
        System.out.println("Mobile Name is: "+s);
    }
}

class OnePlus extends Mobiles 
{
    void mobile() 
    {
    	String s="OnePlus";
        System.out.println("Mobile Name is: "+s);
    }
}

public class Assignment5 
{
    public static void main(String[] args) 
    {
        Mobiles m = null;
        Samsung s = new Samsung();
        AppleIphonne a = new AppleIphonne();
        Google g = new Google();
        OnePlus o = new OnePlus();

        m = s;
        m.mobile();

        m = a;
        m.mobile();

        m = g;
        m.mobile();

        m = o;
        m.mobile();
    }
}
