
import java.util.*;
class Collections2
{
    public static void main(String arg[])
    {
        LinkedList <String> lobj = new LinkedList<String>();

        lobj.add("Prajakta");
        lobj.add("Devika");
        lobj.add("Rohina");

        System.out.println("Elements of linked list are: "+lobj);
        lobj.addFirst("Pooja");
        System.out.println("Elements of linked list are: "+lobj);

        lobj.addLast("Sneha");
        System.out.println("Elements of linked list are: "+lobj);

        Iterator iobj = lobj.iterator();
         System.out.println("Data using iterator is:");
         while(iobj.hasNext())
         {
            System.out.println(iobj.next());
         }
         
        lobj.remove();// first element will be removed 
        System.out.println("Elements of linked list are: "+lobj);

        lobj.remove(1);
        System.out.println("Elements of linked list are: "+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list are: "+lobj);

        System.out.println("Elements of linked list are: "+lobj.size());

        lobj.set(1,"Anu");
        System.out.println("Elements of linked list are: "+lobj);

        lobj.clear();
        System.out.println("Elements of linked list are: "+lobj);
    }
}
// hi line internally 250 line cha code krte
//LinkedList <> lobj = new LinkedList<>();