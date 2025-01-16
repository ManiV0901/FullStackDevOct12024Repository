package abstractassignments;

abstract class Stationery 
{
    void item(String item) 
    {
        System.out.println("Item: " + item);
    }
}

class Notebook extends Stationery 
{
    void notebook(String notebook) 
    {
        System.out.println("Notebook: " + notebook);
    }
}

class Diary extends Stationery 
{
    void diary(String diary) 
    {
        System.out.println("Diary: " + diary);
    }
}

class Pencils extends Diary {
    void pencils(String pencils) {
        System.out.println("Pencils: " + pencils);
    }
}

public class Assign7
{
    public static void main(String[] args) 
    {
        Notebook n1 = new Notebook();
        n1.item("Item");
        n1.notebook("There will be one notebook allocated");

        Pencils p = new Pencils();
        p.item("Item");
        p.pencils("5 pencils");
        p.diary("100 pages");
    }
}