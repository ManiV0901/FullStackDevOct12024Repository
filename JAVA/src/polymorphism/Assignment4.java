package polymorphism;

abstract class Vegetables 
{
    abstract void vegetable();
}

class Carrot extends Vegetables 
{
    void vegetable() 
    {
    	String s="Carrot";
        System.out.println("Vegetable Name is: "+s);
    }
}

class Broccoli extends Vegetables 
{
    void vegetable() 
    {
    	String s="Broccoli";
        System.out.println("Vegetable Name is: "+s);
    }
}

class Spinach extends Vegetables 
{
    void vegetable() 
    {
    	String s="Spinach";
        System.out.println("Vegetable Name is: "+s);
    }
}

class Beetroot extends Vegetables 
{
    void vegetable() 
    {
    	String s="Beetroot";
        System.out.println("Vegetable Name is: "+s);
    }
}

public class Assignment4 
{
    public static void main(String[] args) 
    {
        Vegetables v = null;
        Carrot c = new Carrot();
        Broccoli b = new Broccoli();
        Spinach s = new Spinach();
        Beetroot be = new Beetroot();

        v = c;
        v.vegetable();

        v = b;
        v.vegetable();

        v = s;
        v.vegetable();

        v = be;
        v.vegetable();
    }
}
