package stringDemo;

public class Assign6 
{

	public static void main(String[] args) 
	{
		String s = "ABCDEF";
        String rev = "";
        for (int i = s.length(); i > 0; i--) 
        {
            rev += s.substring(i - 1, i);
        }
        System.out.println(rev);
	}

}
