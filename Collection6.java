import java.util.*;
class Collection6
{
    public static void main(String arg[])
    {
       Stack <Character> sobj = new <Character> Stack();

       sobj.push('a');
       sobj.push('b');
       sobj.push('c');
       sobj.push('d');
       sobj.push('e');

       System.out.println("Elements of stack:"+sobj);

       System.out.println("Poped elements is: "+sobj.pop());
       

    }
}