class StaticDemo
{
    static                  // static block
    {
    
       System.out.println("Inside static block of StaticDemo class which contains main");
       
    }
    //main 
    public staticDemo()
    {
      
       
    }
    public static void main(String arg[])
    {
       System.out.println("Inside main");
       //data accessing without creating anything
       System.out.println("value of static No3 :"+Demo.No3);
       System.out.println("value of static No4 :"+Demo.No4);
       System.out.println("value of static a :"+Demo.a);
       System.out.println("value of static b :"+Demo.b);
       //Demo obj1 = new Demo();
       Demo.gun();
       Demo obj1 = new Demo();
       Demo obj2 = new Demo();
       obj1.Fun();
    }
}
class Demo
{
    public int No1;         // non static cha
    public int No2;         // non static cha
    public static int No3;  // static characteristic
    public static int No4;  // static characteristic

    static                  // static block
    {
       No3 = 51;
       No4 = 101;
       System.out.println("Inside static block");
       
    }
    //1 constructor 100 obj but static block only 1

    // constructor
    public Demo()
    {
       System.out.println("Inside constructor");
       No1 = 11;
       No2 = 21;
    }

    // non static method
    public void Fun()
    {
    //non static method can access static as well as non static data
    //we can use this keyword
      System.out.println("Inside non static method fun"); 

    }

    // static method
    public static void gun()
    {
      //static method can acccesss only static adata
      System.out.println("Inside static method gun");  
      
    }

}