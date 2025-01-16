package polymorphism;

abstract class Subjects 
{
    abstract void subject();
}

class Math extends Subjects 
{
    void subject() 
    {
    	String s="Math";
        System.out.println("Subject Name is: "+s);
    }
}

class Science extends Subjects 
{
    void subject() 
    {
    	String s="Science";
        System.out.println("Subject Name is: "+s);
    }
}

class English extends Subjects 
{
    void subject() 
    {
    	String s="English";
        System.out.println("Subject Name is: "+s);
    }
}

class History extends Subjects 
{
    void subject() 
    {
    	String s="History";
        System.out.println("Subject Name is: "+s);
    }
}

public class Assignment3 
{
    public static void main(String[] args) 
    {
        Subjects s = null;
        Math m = new Math();
        Science sc = new Science();
        English e = new English();
        History h = new History();

        s = m;
        s.subject();

        s = sc;
        s.subject();

        s = e;
        s.subject();

        s = h;
        s.subject();
    }
}
