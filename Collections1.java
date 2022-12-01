import java.util.*;
class Collections1
{
    public static void main(String arg[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);
        System.out.println("Elements of linked list are: "+lobj);
        lobj.addFirst(1);
        System.out.println("Elements of linked list are: "+lobj);

        lobj.addLast(130);
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

        lobj.set(1,500);
        System.out.println("Elements of linked list are: "+lobj);
        
        lobj.clear();
        System.out.println("Elements of linked list are: "+lobj);
    }
}
// hi line internally 250 line cha code krte
//LinkedList <> lobj = new LinkedList<>();