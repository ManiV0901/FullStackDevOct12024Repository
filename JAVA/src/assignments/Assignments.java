package assignments;
//class Multiplication 
//{
//    void Multiplication1() 
//    {
//        int a[] = {1, 2, 3, 4, 5};
//        int b[] = {1, 2, 3, 4, 5};
//        int result[] = new int[a.length];
//        for (int i = 0; i < a.length; i++) 
//        {
//            result[i] = a[i] * b[i];
//        }
//        for (int i = 0; i < result.length; i++) 
//        {
//            System.out.print(result[i] + " ");
//        }
//    }
//}
//
//public class Assignments 
//{
//    public static void main(String[] args) 
//    {
//        Multiplication m1 = new Multiplication();
//        m1.Multiplication1();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Prime
//{
//	void primenos()
//	{
//		int primecount=0;
//		for(int j=50;j<=100;j++)
//		{
//			int num=j;
//			int count=0;
//			for(int i=1;i<=num;i++)
//			{
//			if(num%i==0)
//			{
//				count++;
//			}
//			}
//		if(count==2)
//		{
//			System.out.println(num);
//		}
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		Prime p1=new Prime();
//		p1.primenos();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Prime
//{
//	void primenos()
//	{
//		int primecount=0;
//		for(int j=100;j<=200;j++)
//		{
//			int num=j;
//			int count=0;
//			for(int i=1;i<=num;i++)
//			{
//			if(num%i==0)
//			{
//				count++;
//			}
//			}
//		if(count==2)
//		{
//			primecount++;
//		}
//		}
//		{
//			System.out.println(primecount);
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		Prime p1=new Prime();
//		p1.primenos();
//	}
//}
//-----------------------------------------------------------------------------------------------------------------------------//
//class PrimeSum 
//{
//    void primenos() 
//    {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) 
//        {
//            int count = 0;
//            for (int j = 1; j <= i; j++) 
//            {
//                if (i % j == 0) 
//                {
//                    count++;
//                }
//            }
//            if (count == 2) 
//			  {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//}
//
//public class Assignments 
//    {
//    public static void main(String args[]) 
//    {
//        PrimeSum p1 = new PrimeSum();
//        p1.primenos();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Assign
//{
//	void as()
//	{
//		String s[]= {"Mayu","Somu","Anku","Mani"};
//		String b=" ";
//		for(int i=s.length/2;i<s.length;i++)
//		{
//			b+=s[i];
//		}
//		System.out.println(b);
//	}
//}
//public class Assignments
//{
//    public static void main(String args[])
//    {
//    	Assign a=new Assign();
//    	a.as();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Sub
//{
//	void substraction()
//	{
//		int a[][]={{10,23},{39,42}};
//		int b[][]={{5,15},{25,35}};
//		int result[][]=new int[a.length][a[1].length];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				result[i][j]=a[i][j]-b[i][j];
//				System.out.print(result[i][j]+" ");
//		}
//			System.out.println();
//		}
//		for(int i=0;i<result.length;i++)
//		{
//			for(int j=0;j<result[i].length;j++)
//			{
//				System.out.print(result[j][i]+" ");
//
//			}
//			System.out.println();
//
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		Sub s=new Sub();
//		s.substraction();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Fibonacci
//{
//    void fibo() 
//    {
//        int a = 0;
//        int b = 1;
//        int fib[] = new int[10];
//        int sum=0;
//        for (int i = 2; i <= 9; i++) 
//        {
//            int c = a + b;
//            a = b;
//            b = c;
//            fib[i] = c;
//            sum=sum+fib[i];
//        }
//        System.out.print(sum + " ");
//        
//    }
//}
//
//public class Assignments
//{
//	public static void main(String []args)
//	{
//		Fibonacci f1=new Fibonacci();
//		f1.fibo();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Tables
//{
//	void Multipy()
//	{
//		for(int i=1;i<=20;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String []args)
//	{
//		Tables t1=new Tables();
//		t1.Multipy();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class Add
//{
//	void addition()
//	{
//		int a[][]={{10,23},{39,42}};
//		int b[][]={{5,15},{25,35}};
//		int result[][]=new int[a.length][a[1].length];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				result[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		int sum=0;
//		for(int m=0;m<result[1].length;m++)
//		{
//			sum=sum+result[1][m];
//		}
//		System.out.println(sum);
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		Add s=new Add();
//		s.addition();
//	}
//}
//---------------------------------------------------------------------------------------------------------------------------//
//class CharacterAssign
//{
//	void charass()
//	{
//		char ch[]= {'a','b','c','d'};
//		char hc[]=new char[ch.length];
//		int k=0;
//		for(int i=0;i<ch.length;i++)
//		{
//			hc[k]=ch[i];
//			k++;
//		}
//		for(int j=hc.length-1;j>=hc.length/2;j--)
//		{
//			System.out.println(hc[j]);
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		CharacterAssign ca=new CharacterAssign();
//		ca.charass();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class StringAssign
//{
//	void strass()
//	{
//		String a[]= {"mani","veera","anku","mayu"};
//		String b[]=new String[a.length/2];
//		int k=0;
//		for(int i=a.length/2;i<a.length;i++)
//		{
//			b[k]=a[i];
//			k++;
//		}
//		for(int j=b.length-1;j>=0;j--)
//		{
//			System.out.println(b[j]);
//		}
//	}
//}
//public class Assignments
//{
//	public static void main(String args[])
//	{
//		StringAssign s=new StringAssign();
//		s.strass();
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------//
class AssignEight
{
	void asseig()
	{
		int a[]= {1,2,3};
		int b[]= {2,3,4};
		int c[]= {3,4,1};
		int result[]=new int[a.length+b.length+c.length];
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			result[m]=a[i];
			m++;
		}
		for(int j=0;j<b.length;j++)
		{
			result[m]=b[j];
			m++;
		}
		for(int k=0;k<b.length;k++)
		{
			result[m]=c[k];
			m++;
		}
		int pro=1;
		for(int n=result.length/2;n<result.length;n++)
		{
		 pro=pro*result[n];
		}
		System.out.println(pro);
	}
}
public class Assignments
{
	public static void main(String args[])
	{
		AssignEight ae=new AssignEight();
		ae.asseig();
	}
}