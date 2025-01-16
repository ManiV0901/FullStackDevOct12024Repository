package assignmenttwenty;
//
//class SumOftenintReturn
//{
//    int sum(int start,int end)
//    {
//        int sum=0;
//        for(int i=start;i<=end;i++)
//        {
//            sum=sum+i;
//        }
//        return sum;
//    }
//}
//public class Assign {
//    public static void main(String[] args) {
//        SumOftenintReturn o=new SumOftenintReturn();
//        int v1=o.sum(10,20);
//        System.out.println(v1);
//
//    }
//}
//-----------------------------------------------------------------------------------------------------------------------------//
//class Prime
//{
//	int getPrime(int x, int y)
//	{
//		int count=0;
//		for(int j=x;j<=y;j++)
//		{
//			if(j%6==0)
//			{
//				count++;
//			}
//		}
//		return count;
//	}
//}
//public class Assign
//{
//	public static void main(String[] args) {
//		Prime p=new Prime();
//		int b=p.getPrime(100,200);
//		System.out.println(b);
//	}
//}
//-----------------------------------------------------------------------------------------------------------------------------//
//class Three
//{
//	long getName(int x[])
//	{
//		long sum=0;
//		for(int i=0;i<x.length;i++)
//		{
//			sum=sum+x[i];
//		}
//		return sum;
//	}
//}
//public class Assign
//{
//	public static void main(String args[])
//	{
//		Three t=new Three();
//		long l=t.getName (new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19});
//		System.out.println(l);
//	}
//}
//-----------------------------------------------------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------------------------------------------------//
//class Table
//{
//	int[] seventhTable(int num)
//	{
//		int[] temp=new int[10];
//		for(int i=1;i<=10;i++)
//		{
//			temp[i-1]=num*i;
//		}
//		return temp;
//	}
//}
//public class Assign
//{
//	public static void main(String args[])
//	{
//		Table t=new Table();
//		int num=7;
//		int[] d=t.seventhTable(num);
//		for(int i=0;i<d.length;i++)
//		{
//		System.out.println(num + " x " + (i + 1) + " = " + d[i]);
//		}
//	}
//}
//--------------------------------------------------------------------------------------------------------------------------//

//class Five
//{
//	int getFive(int start, int end)
//	{
//		int count=0;
//		for(int i=start;i>=end;i--)
//		{
//			if(i%2 != 0)
//			{
//				count++;
//			}
//		}
//		return count;
//	}
//}
//public class Assign
//{
//	public static void main(String args[])
//	{
//		Five f=new Five();
//		int start=40;
//		int end=20;
//		int b=f.getFive(start, end);
//		System.out.println("count of odd numbers between " + start + " and " + end + ": " + b);
//	}
//}
//-----------------------------------------------------------------------------------------------------------------------------//

//class TwoArray {
//
//   int[] addition(int[] array1, int[] array2) {
//      if (array1.length != array2.length) {
//          throw new IllegalArgumentException("Arrays must have the same length");
//      }
//
//      int[] result = new int[array1.length];
//      for (int i = 0; i < array1.length; i++) {
//          result[i] = array1[i] + array2[i];
//      }
//      return result;
//  }
//}
//public class Assign {
//
//  public static void main(String[] args) {
//      TwoArray as = new TwoArray();
//
//      // Assuming addition() method takes two arrays and returns their sum as an array
//      int[] array1 = {1, 2, 3}; // Example array
//      int[] array2 = {4, 5, 6}; // Example array
//      int[] result = as.addition(array1, array2);
//
//      for (int value : result) {
//          System.out.println(value);
//      }
//  }
//}
//----------------------------------------------------------------------------------------------------------------------------//

//class TwoD
//{
//    int[] Arr(int[][] a)
//    {
//        return a[0];
//    }
//}
//
//public class Assign {
//    public static void main(String[] args) {
//        TwoD t=new TwoD();
//        int a[]=t.Arr(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
//        for(int temp:a)se
//        {
//        System.out.println(temp);
//        }
//
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------//

//class Transpose
//{
//    int[][] TransArr(int a[][])
//    {
//        int row=a.length;
//        int col=a[0].length;
//        int transposed[][]=new int[col][row];
//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<a[i].length;j++)
//            {
//                transposed[j][i]=a[i][j];
//            }
//        }
//
//        return transposed;
//    }
//}
//public class Assign {
//    public static void main(String[] args) {
//        Transpose t=new Transpose();
//        int a[][]=t.TransArr(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<a[i].length;j++)
//            {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------------//
//class OddNumbers 
//{
//    int countOdd(int start, int end) 
//    {
//        int count = 0;
//        for (int i = start; i <= end; i++) 
//        {
//            if (i % 2 == 1)
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//}
//
//public class Assign 
//{
//    public static void main(String[] args) 
//    {
//        OddNumbers a = new OddNumbers();
//        int start=1; 
//        int end=500;
//        int m = a.countOdd(start, end);
//        System.out.println(m);
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------//
//public class Assign 
//{
//    public static void main(String[] args) 
//    {
//        byte[][] a = {{1, 2, 3}, {1, 2, 3}};
//        byte[] b = ByteA(a);
//        for (byte temp : b) {
//            System.out.println(temp);
//        }
//    }
//
//    public static byte[] ByteA(byte[][] a) {
//        return a[1];
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------//

//class Divisible{
//    int[] DivByten(int start,int end)
//    {
//        int count=0;
//        for(int i=start;i>=end;i--)
//        {
//
//            if(i%10==0)
//            {
//                count++;
//
//            }
//        }
//        int a[]=new int[count];
//        int k=0;
//        for(int i=start;i>=end;i--)
//        {
//
//            if(i%10==0)
//            {
//                a[k]=i;
//                k++;
//            }
//        }
//        return a;
//
//    }
//}
//public class Assign {
//    public static void main(String[] args) {
//        Divisible d=new Divisible();
//        int a[]=d.DivByten(500,200);
//        for(int temp:a)
//        {
//            System.out.print(temp+" ");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------------//