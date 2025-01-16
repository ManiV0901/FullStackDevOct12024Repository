//package product;
//class Prod
//{
//	String Name;
//	String Company;
//	String place;
//	String delivary;
//	int Payment;
//}
//class Order
//{
//	String Items;
//	String Invoice;
//	String Delivary;
//	String Return;
//	int Payment;
//}
//class Shipping
//{
//	int Reciept;
//	String from;
//	String To;
//	String company;
//	String name;
//}
//
//public class product1 {
//
//	public static void main(String[] args) {
//		Prod p1=new Prod();
//		p1.Name="Fan";
//		p1.Company="INVOICENUMBER1";
//		p1.place="RECIEPT1";
//		p1.delivary="COD";
//		p1.Payment=500;
//		System.out.println("Name:"+p1.Name);
//		System.out.println("id:"+p1.Company);
//		System.out.println("Salary:"+p1.place);
//		System.out.println("JoiningDate:"+p1.delivary);
//		System.out.println("Experience:"+p1.Payment);
//		System.out.println("***********************************");
//		Order o1=new Order();
//		o1.Items="MOBILE";
//		o1.Invoice="INVOICE1";
//		o1.Delivary="MYSORE";
//		o1.Return="OLDMOBILE";
//		o1.Payment=10000;
//		System.out.println("Name:"+o1.Items);
//		System.out.println("id:"+o1.Invoice);
//		System.out.println("Salary:"+o1.Delivary);
//		System.out.println("JoiningDate:"+o1.Return);
//		System.out.println("Experience:"+o1.Payment);
//		System.out.println("***********************************");
//		Shipping s=new Shipping();
//		s.Reciept=100;
//		s.from="BGLR";
//		s.To="MYSORE";
//		s.company="LENOVO";
//		s.name="LAPY";
//		System.out.println("Name:"+s.Reciept);
//		System.out.println("id:"+s.from);
//		System.out.println("Salary:"+s.To);
//		System.out.println("JoiningDate:"+s.company);
//		System.out.println("Experience:"+s.name);
//	}
//
//}
//----------------------------*********************************---------------------------------
//package product;
//
//class Prod
//{
//	String Name;
//	String Company;
//	String place;
//	String delivary;
//	int Payment;
//	Prod()
//	{
//		Name="Fan";
//		Company="INVOICENUMBER1";
//		place="RECIEPT1";
//		delivary="COD";
//		Payment=500;
//		System.out.println("Name:"+Name);
//		System.out.println("id:"+Company);
//		System.out.println("Salary:"+place);
//		System.out.println("JoiningDate:"+delivary);
//		System.out.println("Experience:"+Payment);
//		System.out.println("***********************************");
//
//	}
//}
//class Order
//{
//	String Items;
//	String Invoice;
//	String Delivary;
//	String Return;
//	int Payment;
//	Order()
//	{
//		Items="MOBILE";
//		Invoice="INVOICE1";
//		Delivary="MYSORE";
//		Return="OLDMOBILE";
//		Payment=10000;
//		System.out.println("Name:"+Items);
//		System.out.println("id:"+Invoice);
//		System.out.println("Salary:"+Delivary);
//		System.out.println("JoiningDate:"+Return);
//		System.out.println("Experience:"+Payment);
//		System.out.println("***********************************");
//	}
//}
//class Shipping
//{
//	int Reciept;
//	String from;
//	String To;
//	String company;
//	String name;
//	Shipping()
//	{
//		Reciept=100;
//		from="BGLR";
//		To="MYSORE";
//		company="LENOVO";
//		name="LAPY";
//		System.out.println("Name:"+Reciept);
//		System.out.println("id:"+from);
//		System.out.println("Salary:"+To);
//		System.out.println("JoiningDate:"+company);
//		System.out.println("Experience:"+name);
//
//	}
//}
//
//public class product1 {
//
//	public static void main(String[] args) {
//		Prod p1=new Prod();
//		Order o1=new Order();
//		Shipping s=new Shipping();
//
//	}
//
//}
package product;

class Prod
{
	String Name;
	String Company;
	String place;
	String delivary;
	int Payment;
	Prod(String name,
	String company,
	String Place,
	String Delivary,
	int payment)
	{
		Name=name;
		Company=company;
		place=Place;
		delivary=Delivary;
		Payment=payment;
		System.out.println("Name:"+Name);
		System.out.println("Company:"+Company);
		System.out.println("Place:"+place);
		System.out.println("Delivary:"+delivary);
		System.out.println("Payment:"+Payment);
		System.out.println("***********************************");

	}
}
class Order
{
	String Items;
	String Invoice;
	String Delivary;
	String Return;
	int Payment;
	Order( String items,
	String invoice,
	String delivary,
	String ret,
	int payment)
	{
		Items=items;
		Invoice=invoice;
		Delivary=delivary;
		Return=ret;
		Payment=payment;
		System.out.println("Items:"+Items);
		System.out.println("Invoice:"+Invoice);
		System.out.println("Delivary:"+Delivary);
		System.out.println("Return:"+Return);
		System.out.println("Payment:"+Payment);
		System.out.println("***********************************");
	}
}
class Shipping
{
	int Reciept;
	String from;
	String To;
	String company;
	String name;
	Shipping(int reciept,
	String From,
	String to,
	String Company,
	String Name)
	{
		Reciept=reciept;
		from=From;
		To=to;
		company=Company;
		name=Name;
		System.out.println("Reciept:"+Reciept);
		System.out.println("From:"+from);
		System.out.println("To:"+To);
		System.out.println("Company:"+company);
		System.out.println("Name:"+name);

	}
}
public class product1 {

	public static void main(String[] args) {
		Prod p1=new Prod("Fan","Amazon","ymg", "bng", 550);
		Order o1=new Order("MOBILE", "INVOICE1", "MYSORE", "OLDMOBILE", 10000);
		Shipping s=new Shipping(450, "mani", "veera", "phillips","TubeLigth");

	}

}


