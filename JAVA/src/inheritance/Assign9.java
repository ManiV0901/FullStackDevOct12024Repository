package inheritance;


class Branch
{
	String branch;
    void branchName() 
    {
    	branch="BrancheName";
        System.out.println("Branch: " + branch);
    }
}

class CSE extends Branch 
{
	String branch;
    void cse()
    {
    	branch="BranchName";
        System.out.println("CSE: " + branch);
    }
}

class ECE extends CSE 
{
	String branch;
    void ece() 
    {
    	branch="BranchName";
        System.out.println("ECE: " + branch);
    }
}
public class Assign9 
{

	public static void main(String[] args) 
	{
		ECE e = new ECE();
		e.branch="CSE";
        e.branchName();
        ECE e1 = new ECE();
		e1.branch="CSE";
		e1.cse();
		ECE e2 = new ECE();
		e2.branch="ECE";
		e2.ece();
	}

}

