package stringDemo;

public class Assign7 
{
	public static void main(String[] args) 
	{
		 String str = "Manikanta";
	        int count = 0;
	        for (char c : str.toCharArray()) 
	        {
	            count++;
	        }
	        System.out.println("Number of characters: " + count);
	}

}
