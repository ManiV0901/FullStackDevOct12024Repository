//package Article;
//
//class Article1
//{
//	String Name;
//	String Positive;
//	String Negative;
//	String Quetions;
//	String Feedback;
//}
//class Comments
//{
//	String News;
//	String Positive;
//	String Negative;
//	String Questions;
//	String Feedback;
//}
//
//public class Art {
//
//	public static void main(String[] args) {
//		Article1 p1=new Article1();
//		p1.Name="AA123";
//		p1.Positive="GOOD";
//		p1.Negative="BAD";
//		p1.Quetions="WHYTHIS";
//		p1.Feedback="IMPROVE SOME BETTER";
//		System.out.println("Name:"+p1.Name);
//		System.out.println("id:"+p1.Positive);
//		System.out.println("Salary:"+p1.Negative);
//		System.out.println("JoiningDate:"+p1.Quetions);
//		System.out.println("Experience:"+p1.Feedback);
//		System.out.println("***********************************");
//		Comments o1=new Comments();
//		o1.News="Article";
//		o1.Positive="Good";
//		o1.Negative="Bad";
//		o1.Questions="Whythis";
//		o1.Feedback="Improve better";
//		System.out.println("Name:"+o1.News);
//		System.out.println("id:"+o1.Positive);
//		System.out.println("Salary:"+o1.Negative);
//		System.out.println("JoiningDate:"+o1.Questions);
//		System.out.println("Experience:"+o1.Feedback);
//		System.out.println("***********************************");
//
//	}
//
//}
//---------------------------------*******************************************-------------------------------------
//package Article;
//
//class Article1
//{
//	String Name;
//	String Positive;
//	String Negative;
//	String Quetions;
//	String Feedback;
//	Article1()
//	{
//		Name="AA123";
//		Positive="GOOD";
//		Negative="BAD";
//		Quetions="WHYTHIS";
//		Feedback="IMPROVE SOME BETTER";
//		System.out.println("Name:"+Name);
//		System.out.println("id:"+Positive);
//		System.out.println("Salary:"+Negative);
//		System.out.println("JoiningDate:"+Quetions);
//		System.out.println("Experience:"+Feedback);
//		System.out.println("***********************************");
//
//	}
//	
//}
//class Comments
//{
//	String News;
//	String Positive;
//	String Negative;
//	String Questions;
//	String Feedback;
//	Comments()
//	{
//		News="Article";
//		Positive="Good";
//		Negative="Bad";
//		Questions="Whythis";
//		Feedback="Improve better";
//		System.out.println("Name:"+News);
//		System.out.println("id:"+Positive);
//		System.out.println("Salary:"+Negative);
//		System.out.println("JoiningDate:"+Questions);
//		System.out.println("Experience:"+Feedback);
//		System.out.println("***********************************");
//
//	}
//}
//
//
//public class Art {
//
//	public static void main(String[] args) {
//		Article1 p1=new Article1();
//		Comments o1=new Comments();
//	}
//
//}
package Article;

class Article1
{
	String Name;
	String Positive;
	String Negative;
	String Quetions;
	String Feedback;
	Article1(String name,
	String positive,
	String negative,
	String quetions,
	String feedback)
	{
		Name=name;
		Positive=positive;
		Negative=negative;
		Quetions=quetions;
		Feedback=feedback;
		System.out.println("Name:"+Name);
		System.out.println("Positive:"+Positive);
		System.out.println("Negative:"+Negative);
		System.out.println("Quetions:"+Quetions);
		System.out.println("Feedback:"+Feedback);
		System.out.println("***********************************");

	}
	
}
class Comments
{
	String News;
	String Positive;
	String Negative;
	String Questions;
	String Feedback;
	Comments(String news,
	String positive,
	String negative,
	String quetions,
	String feedback)
	{
		News=news;
		Positive=positive;
		Negative=negative;
		Questions=quetions;
		Feedback=feedback;
		System.out.println("News:"+News);
		System.out.println("Positive:"+Positive);
		System.out.println("Negative:"+Negative);
		System.out.println("Questions:"+Questions);
		System.out.println("Feedback:"+Feedback);
		System.out.println("***********************************");

	}
}


public class Art {

	public static void main(String[] args) {
		Article1 p1=new Article1("AA123", "GOOD", "BAD", "WHYTHIS", "IMPROVE SOME BETTER");
		Comments o1=new Comments("Article", "Good", "Bad", "Whythis", "Improve better");
	}

}