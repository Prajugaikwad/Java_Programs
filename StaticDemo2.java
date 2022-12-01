/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 class StaticDemo2
{
    public int No1 ;
    public int No2;
    public static int No3 ;
    public static int No4 ; 
    public  StaticDemo2()
    {
        System.out.println("Inside Constructor");
        No1 = 1;
        No2 = 2; 
    }
   static 
   {
    System.out.println("Inside static block...");
    No3 = 4;
    No4 = 5;
   }
   public static void Fun()
   {
     System.out.println("Inside static method Fun ...\n");
     System.out.println("The Value of No3 is: "+No3);
     System.out.println("The Value of No4 is: "+No4);
   }
    public void Gun()
   {
     System.out.println("Inside method Gun ...\n");
     System.out.println("The Value of No1 is: "+No1);
     System.out.println("The Value of No2 is: "+No2);
   }
   public static void main(String arg[])
   {
    System.out.println("Inside main method...\n");
    StaticDemo2.Fun();
    StaticDemo2 obj1 = new StaticDemo2();
    StaticDemo2 obj2 = new StaticDemo2();
    obj1.Gun();
   }
}
