package stringDemo;

public class Assign9 
{

	public static void main(String[] args) 
	{
		   String str = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
	        StringBuilder result = new StringBuilder();
	        int dayIndex = 0;
	        while (dayIndex < str.length()) {
	            if (dayIndex <= str.length() - 3 && str.substring(dayIndex, dayIndex + 3).equals("DAY")) {
	                result.append(str.substring(dayIndex - 3, dayIndex + 3)).append(", ");
	                dayIndex += 3;
	            } else {
	                dayIndex++;
	            }
	        }
	        System.out.println("Result: " + result.toString().trim());

	       
	}

}
