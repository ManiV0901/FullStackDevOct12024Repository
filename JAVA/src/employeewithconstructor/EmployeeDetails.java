//package employeewithconstructor;
//
//class Employee
//{
//	String Name;
//	int id;
//	int Salary;
//	String JoiningDate;
//	int Experience;
//}
//class Department
//{
//	String FacultyNames;
//	int Id;
//	int members;
//	int salaries;
//	int FacultyExperience;
//}
//class Insurance
//{
//	String FullName;
//	String PersonName;
//	int id;
//	int PolicyAmount;
//	String JoiningDate;
//}
//public class EmployeeDetails {
//
//	public static void main(String[] args) {
//		Employee emp=new Employee();
//		emp.Name="Mayuri";
//		emp.id=123;
//		emp.Salary=50000;
//		emp.JoiningDate="20/20/2024";
//		emp.Experience=2;
//		System.out.println("Name:"+emp.Name);
//		System.out.println("id:"+emp.id);
//		System.out.println("Salary:"+emp.Salary);
//		System.out.println("JoiningDate:"+emp.JoiningDate);
//		System.out.println("Experience:"+emp.Experience);
//		System.out.println("***********************************");
//		Department dept=new Department();
//		dept.FacultyNames="Mayuri";
//		dept.Id=123;
//		dept.members=5;
//		dept.salaries=50000;
//		dept.FacultyExperience=2;
//		System.out.println("Name:"+dept.FacultyNames);
//		System.out.println("id:"+dept.Id);
//		System.out.println("members:"+dept.members);
//		System.out.println("salaries:"+dept.salaries);
//		System.out.println("FacultyExperience:"+dept.FacultyExperience);
//		System.out.println("***********************************");
//		Insurance ins=new Insurance();
//		ins.FullName="Mayuri";
//		ins.PersonName="Vattare";
//		ins.id=5;
//		ins.PolicyAmount=500000;
//		ins.JoiningDate="20/20/2015";
//		System.out.println("Name:"+ins.FullName);
//		System.out.println("id:"+ins.PersonName);
//		System.out.println("Salary:"+ins.id);
//		System.out.println("JoiningDate:"+ins.PolicyAmount);
//		System.out.println("Experience:"+ins.JoiningDate);
//	}
//
//}
//------------------------------------********************************--------------------------------------
package employeewithconstructor;
class Employee
{
	String Name;
	int id;
	int Salary;
	String JoiningDate;
	int Experience;
	Employee()
	{
	    Name="Mayuri";
		id=123;
		Salary=50000;
		JoiningDate="20/20/2024";
		Experience=2;
		System.out.println("Name:"+Name);
		System.out.println("id:"+id);
		System.out.println("Salary:"+Salary);
		System.out.println("JoiningDate:"+JoiningDate);
		System.out.println("Experience:"+Experience);
		System.out.println("***********************************");
	}
}
class Department
{
	String FacultyNames;
	int Id;
	int members;
	int salaries;
	int FacultyExperience;
	Department()
	{
	    FacultyNames="Mayuri";
		Id=123;
		members=5;
		salaries=50000;
		FacultyExperience=2;
		System.out.println("Name:"+FacultyNames);
		System.out.println("id:"+Id);
		System.out.println("Salary:"+members);
		System.out.println("JoiningDate:"+salaries);
		System.out.println("Experience:"+FacultyExperience);
		System.out.println("***********************************");
	}
}
class Insurance
{
	String FullName;
	String PersonName;
	int id;
	int PolicyAmount;
	String JoiningDate;
	Insurance()
	{
	    FullName="Mayuri";
		PersonName="Vathare";
		id=5;
		PolicyAmount=500000;
		JoiningDate="20/20/2015";
		System.out.println("Name:"+FullName);
		System.out.println("id:"+PersonName);
		System.out.println("Salary:"+id);
		System.out.println("JoiningDate:"+PolicyAmount);
		System.out.println("Experience:"+JoiningDate);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee emp =new Employee();
		Department dept =new Department();
		Insurance ins =new Insurance();

	}

}

//------------------------************************************--------------------------------------------------------------
//package employeewithconstructor;
//
//class Employee
//{
//	String Name;
//	int id;
//	int Salary;
//	String JoiningDate;
//	int Experience;
//	Employee(String name,int Id,int salary,String joiningdate,int experience)
//	{
//		Name=name;
//		id=Id;
//		Salary=salary;
//		JoiningDate=joiningdate;
//		Experience=experience;
//		System.out.println("Name:"+Name);
//		System.out.println("id:"+id);
//		System.out.println("Salary:"+Salary);
//		System.out.println("JoiningDate:"+JoiningDate);
//		System.out.println("Experience:"+Experience);
//		System.out.println("***********************************");
//	}
//}
//class Department
//{
//	String FacultyNames;
//	int Id;
//	int members;
//	int salaries;
//	int FacultyExperience;
//	Department(String facultynames, int id, int Members, int Salaries, int facultyexperience)
//	{
//		FacultyNames=facultynames;
//		Id=id;
//		members=Members;
//		salaries=Salaries;
//		FacultyExperience=facultyexperience;
//		System.out.println("Name:"+FacultyNames);
//		System.out.println("id:"+Id);
//		System.out.println("Members:"+members);
//		System.out.println("Salary:"+salaries);
//		System.out.println("Experience:"+FacultyExperience);
//		System.out.println("***********************************");
//
//	}
//}
//class Insurance
//{
//	String FullName;
//	String PersonName;
//	int id;
//	int PolicyAmount;
//	String JoiningDate;
//	Insurance(String fullname, String personname, int Id, int policyamount, String joiningdate)
//	{
//		FullName=fullname;
//		PersonName=personname;
//		id=Id;
//		PolicyAmount=policyamount;
//		JoiningDate=joiningdate;
//		System.out.println("Name:"+FullName);
//		System.out.println("Personname:"+PersonName);
//		System.out.println("id:"+id);
//		System.out.println("Policyamount:"+PolicyAmount);
//		System.out.println("JoiningDate:"+JoiningDate);
//	}
//}
//
//public class EmployeeDetails {
//
//	public static void main(String[] args) {
//		Employee emp=new Employee("Mayuri",21,50000,"20/11/24",2);
//		Department dept=new Department("Mayuri",101,5,50000,2);
//		Insurance ins=new Insurance("Mayuri","Vattare",1221,50000,"20/10/2015");
//	}
//
//}
//---------------------------------**********************************--------------------------------------------------
