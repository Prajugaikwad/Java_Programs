
import java.io.*;
class BufferdInput
{
     public static void main(String A[]) 
     {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferdReader(iobj);
        String name = null;
        int Age = 0;
        float marks = 0.0f;

        try
        {
           System.out.println("Enter your name:");
           name = bobj.readLine();

           System.out.println("Enter your age:");
           Age = Integer.parseInt(bobj.readLine());
       
           System.out.println("Enter your marks:");
           marks = Float.parseFloat(bobj.readLine());

        }

        catch(IOException obj)
        {}

        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Marks: "+Marks);
        
        }
}
     