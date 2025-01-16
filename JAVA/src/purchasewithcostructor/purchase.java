//package purchasewithcostructor;
//class Purchase1
//{
//	String Order;
//	String Invoice;
//	String Reciept;
//	String Return;
//	int Payment;
//}
//class Sales
//{
//	String Order;
//	String Invoice;
//	String Delivary;
//	String Return;
//	int Payment;
//}
//class Inventory
//{
//	int Reciept;
//	String Issue;
//	String Transfer;
//	String Adjustment;
//	String JoiningDate;
//}
//public class purchase {
//
//	public static void main(String[] args) {
//		Purchase1 p1=new Purchase1();
//		p1.Order="PHONENOKIA";
//		p1.Invoice="INVOICENUMBER1";
//		p1.Reciept="RECIEPT1";
//		p1.Return="PHONESAMSUNG";
//		p1.Payment=50000;
//		System.out.println("Name:"+p1.Order);
//		System.out.println("id:"+p1.Invoice);
//		System.out.println("Salary:"+p1.Reciept);
//		System.out.println("JoiningDate:"+p1.Return);
//		System.out.println("Experience:"+p1.Payment);
//		System.out.println("***********************************");
//		Sales s1=new Sales();
//		s1.Order="SHIRTS";
//		s1.Invoice="INVOICE1";
//		s1.Delivary="BENGALUR";
//		s1.Return="PANT";
//		s1.Payment=1200;
//		System.out.println("Name:"+s1.Order);
//		System.out.println("id:"+s1.Invoice);
//		System.out.println("Salary:"+s1.Delivary);
//		System.out.println("JoiningDate:"+s1.Return);
//		System.out.println("Experience:"+s1.Payment);
//		System.out.println("***********************************");
//		Inventory inv=new Inventory();
//		inv.Reciept=1000;
//		inv.Issue="REPAIR";
//		inv.Transfer="VEHICLE";
//		inv.Adjustment="PHONE";
//		inv.JoiningDate="20/20/2015";
//		System.out.println("Name:"+inv.Reciept);
//		System.out.println("id:"+inv.Issue);
//		System.out.println("Salary:"+inv.Transfer);
//		System.out.println("JoiningDate:"+inv.Adjustment);
//		System.out.println("Experience:"+inv.JoiningDate);
//	}
//
//}
//------------------------------------------*******************************-------------------
//package purchasewithcostructor;
//
//
//class Purchase1
//{
//	String Order;
//	String Invoice;
//	String Reciept;
//	String Return;
//	int Payment;
//	Purchase1()
//	{
//		Order="PHONENOKIA";
//		Invoice="INVOICENUMBER1";
//		Reciept="RECIEPT1";
//		Return="PHONESAMSUNG";
//		Payment=50000;
//		System.out.println("Name:"+Order);
//		System.out.println("id:"+Invoice);
//		System.out.println("Salary:"+Reciept);
//		System.out.println("JoiningDate:"+Return);
//		System.out.println("Experience:"+Payment);
//		System.out.println("***********************************");
//
//	}
//}
//class Sales
//{
//	String Order;
//	String Invoice;
//	String Delivary;
//	String Return;
//	int Payment;
//	Sales()
//	{
//		Order="SHIRTS";
//		Invoice="INVOICE1";
//		Delivary="BENGALUR";
//		Return="PANT";
//		Payment=1200;
//		System.out.println("Name:"+Order);
//		System.out.println("id:"+Invoice);
//		System.out.println("Salary:"+Delivary);
//		System.out.println("JoiningDate:"+Return);
//		System.out.println("Experience:"+Payment);
//		System.out.println("***********************************");
//
//	}
//}
//class Inventory
//{
//	int Reciept;
//	String Issue;
//	String Transfer;
//	String Adjustment;
//	String JoiningDate;
//	Inventory()
//	{
//		Reciept=1000;
//		Issue="REPAIR";
//		Transfer="VEHICLE";
//		Adjustment="PHONE";
//		JoiningDate="20/20/2015";
//		System.out.println("Name:"+Reciept);
//		System.out.println("id:"+Issue);
//		System.out.println("Salary:"+Transfer);
//		System.out.println("JoiningDate:"+Adjustment);
//		System.out.println("Experience:"+JoiningDate);
//	}
//}
//
//public class purchase {
//
//	public static void main(String[] args) {
//		Purchase1 p1=new Purchase1();
//		Sales s1=new Sales();
//		Inventory inv=new Inventory();
//
//	}
//
//}
package purchasewithcostructor;


class Purchase1
{
	String Order;
	String Invoice;
	String Reciept;
	String Return;
	int Payment;
	Purchase1(String order,String invoice,String rec,String Ret,int payment)
	{
		Order=order;
		Invoice=invoice;
		Reciept=rec;
		Return=Ret;
		Payment=payment;
		System.out.println("Order:"+Order);
		System.out.println("Invoice:"+Invoice);
		System.out.println("Reciept:"+Reciept);
		System.out.println("Return:"+Ret);
		System.out.println("Payment:"+Payment);
		System.out.println("***********************************");

	}
}
class Sales
{
	String Order;
	String Invoice;
	String Delivary;
	String Return;
	int Payment;
	Sales(String order, String invoice, String Del, String ret, int payment)
	{
		Order=order;
		Invoice=invoice;
		Delivary=Del;
		Return=ret;
		Payment=payment;
		System.out.println("Order:"+Order);
		System.out.println("Invoice:"+Invoice);
		System.out.println("Delivary:"+Delivary);
		System.out.println("Return:"+Return);
		System.out.println("Payment:"+Payment);
		System.out.println("***********************************");

	}
}
class Inventory
{
	int Reciept;
	String Issue;
	String Transfer;
	String Adjustment;
	String JoiningDate;
	Inventory(int Rec, String issue, String transfer, String adjustment, String joiningdate)
	{
		Reciept=Rec;
		Issue=issue;
		Transfer=transfer;
		Adjustment=adjustment;
		JoiningDate=joiningdate;
		System.out.println("Reciept:"+Reciept);
		System.out.println("Issue:"+Issue);
		System.out.println("Transfer:"+Transfer);
		System.out.println("Adjustment:"+Adjustment);
		System.out.println("JoiningDate:"+JoiningDate);
	}
}

public class purchase {

	public static void main(String[] args) {
		Purchase1 p1=new Purchase1("PHONENOKIA", "INVOICENUMBER1", "RECIEPT1", "PHONESAMSUNG", 50000);
		Sales s1=new Sales("SHIRTS", "INVOICE1", "BENGALUR", "PANT", 1200);
		Inventory inv=new Inventory(1000, "REPAIR", "VEHICLE", "PHONE", "20/20/2015");

	}

}

