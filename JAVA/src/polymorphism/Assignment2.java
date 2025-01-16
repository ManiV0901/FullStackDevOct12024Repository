package polymorphism;
abstract class Fruits 
{
    abstract void fruit();
}

class Apple extends Fruits 
{
    void fruit() 
    {
    	String s="Apple";
        System.out.println("Fruit Name is: "+s);
    }
}

class Banana extends Fruits 
{
    void fruit() 
    {
    	String s="Banana";
        System.out.println("Fruit Name is: "+s);
    }
}

class Orange extends Fruits 
{
    void fruit() 
    {
    	String s="Orange";
        System.out.println("Fruit Name is: "+s);
    }
}

class Mango extends Fruits 
{
    void fruit()
    {
    	String s="Mango";
        System.out.println("Fruit Name is: "+s);
    }
}

public class Assignment2 {

	public static void main(String[] args) {
		  Fruits f = null;
	        Apple a = new Apple();
	        Banana b = new Banana();
	        Orange o = new Orange();
	        Mango m = new Mango();

	        f = a;
	        f.fruit();

	        f = b;
	        f.fruit();

	        f = o;
	        f.fruit();

	        f = m;
	        f.fruit();
	    }
	}
