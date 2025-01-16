package polymorphism;

abstract class One
{
	abstract void area();
}
class Two extends One
{
	void area()
	{
		int side=5;
		System.out.println("Area of a Square:"+(side*side));
	}
}
class Three extends One
{
	void area()
	{
		int length=5;
		int breadth=10;
		System.out.println("Area of a Rectangle:"+(length*breadth));
	}
}
class Four extends One
{
	void area()
	{
		double r=5.5;
		double pi=4.12;
		System.out.println("Area of a Circle:"+(pi*r*r));
	}
}
public class Assign1 {

	public static void main(String[] args) {
		One o=null;
		Two o1=new Two();
		Three o2=new Three();
		Four o3=new Four();
		o=o1;
		o.area();
		o=o2;
		o.area();
		o=o3;		
		o.area();
	}

}
