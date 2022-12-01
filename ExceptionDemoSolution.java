import java.util.*;
class ExceptionDemo1
{

    public static void main(String a[])
    {
      //division of two numbers
      Scanner sobj = new Scanner(System.in);
      int iNo1 = 0, iNo2 = 0, iAns = 0;
      System.out.println("Enter the first number: ");
      iNo1 = sobj.nextInt();

      System.out.println("Enter the second number: ");
      iNo2 = sobj.nextInt();

      // try block madhe error yeu shknara code asto
      // erro aale nahi tr control catch madhe jatach nahi
      try
      {
        System.out.println("Inside try block");
         iAns = iNo1 / iNo2; // exception
         System.out.println("Division is:"+iAns);
      }

      // e aal aani jvm ne fekle tr
      // specific
      catch(ArithematicException obj)
      {
         System.out.println("Inside catch block 1");
          System.out.println(obj);
      }
      //specific
      catch(NullPointerException obj)
      {
          System.out.println("Inside catch block 2");
          System.out.println(obj);
      }

      //generic : kahihi yeu de me pkdel
      catch(Exception obj)
      {
           System.out.println("Inside catch block 3");
           System.out.println(obj);
      }

      //e aal tri run nhi tri run
      finally
      {
        System.out.println("Inside finally block");
        sobj.close();
      }

    }
}
// e :tcf
// e no: tf
//e :tc if we dont write f 
//fin : fileclose 
