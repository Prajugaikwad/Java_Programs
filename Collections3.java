
import java.util.*;

class Book
{
    public String Name;
    public int Prize;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Prize = i;
    }

    public void Display()
    {
        System.out.println("Book name : "+this.Name+"Prize: "+this.Prize);
    }
}
class Collections3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj = new LinkedList<Book>();

        Book bobj1 = new Book("Let us c",400);
        Book bobj2 = new Book("Data Structures",500);
        Book bobj3 = new Book("C++ Programming",600);
        Book bobj4 = new Book("Angular web development",700);

        lobj.add(lobj1);
        lobj.add(lobj2);
        lobj.add(lobj3);
        lobj.add(lobj4);
        //lobj.add(new Book("Let us C",400));
        //lobj.add(new Book("Data Structures",560));
        //lobj.add(new Book("C++ Programming",900));
        //lobj.add(new Book("Angular web development",450));

        //
        Iterator iobj = lobj.iterator();
        Book bref = null;

        System.out.println("Elements of linked list are");
        while(iobj.hasNext())
        {
          bref = (Book)iobj.next();
          bref.Display();
        }
        lobj.clear();
    }
}
//LB : Project
//ek dukan of  books so make software to organize
//add new book : enter book name , price 