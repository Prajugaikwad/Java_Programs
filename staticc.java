class staticc
{
    public int No1 = 1 ;
    public int No2 = 2;
    public static int No3 ;
    public static int No4 ; 
   static 
   {
    System.out.println("Inside static block...");
    No3 = 4;
    No4 = 5;
   }
   public staticc void Fun()
   {
     System.out.println("Inside static method Fun ...\n");
     System.out.println("The Value of No3 is: "+No3);
     System.out.println("The Value of No4 is: "+No4);
   }
    public void Gun()
   {
     System.out.println("Inside static method Fun ...\n");
     System.out.println("The Value of No1 is: "+No1);
     System.out.println("The Value of No2 is: "+No2);
   }
   public static void main()
   {
    System.out.println("Inside main method...\n");
    staticc.fun();
    staticc obj1 = new staticc();
    obj1.Gun();
   }
}