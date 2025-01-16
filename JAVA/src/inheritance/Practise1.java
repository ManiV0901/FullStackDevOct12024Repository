package inheritance;

class AA
{
	AA(String s)
	{
		System.out.println(s);
	}
}
class BB extends AA
{
	BB(String c)
	{
		super(c);
		System.out.println(c);
	}
}
public class Practise1 {

	public static void main(String[] args) {
		BB b=new BB("mani");
		BB b1=new BB("veera");

	}

}
