package abstractassignments;

abstract class Book
{
	void boo(String book)
	{
		System.out.println("Book:"+book);
	}
}
class Papers extends Book
{
	void pap(String papers)
	{
		System.out.println("Paper:"+papers);
	}
}
class Pens extends Papers
{
	void pe(String pens)
	{
		System.out.println("Pens:"+pens);
	}
}
public class Assign6 {

	public static void main(String[] args) {
		Pens p=new Pens();
		p.boo("Core Java");
		p.pap("100 pages");
		p.pe("5 pens");
	}

}

