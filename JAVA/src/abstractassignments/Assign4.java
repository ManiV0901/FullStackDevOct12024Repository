package abstractassignments;

abstract class temp
{
	temp(String x)
	{
		System.out.println("Animal name is:"+x);
	}
	temp(int age)
	{
		System.out.println("Animal Age is:"+age);
	}
}
class Forest extends temp
{
	 Forest(String x) 
	   	{
	        super(x);
	    }
	 Forest(int age) 
	   	{
	        super(age);
	    }
	void showAnimal1()
	{
		System.out.println("Animal belongs to bengaluru");
	}
}
public class Assign4 {

	public static void main(String[] args) {
	Forest a=new Forest("Lion");
	Forest a1=new Forest(25);
	a.showAnimal1();
	}

}
