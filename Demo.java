class Maths
{
    public int iNo1;
    public int iNo2;

    public Maths()   // default constructor
    {
       System.out.println("Inside default constructor");
       iNo1 = 0 ;
       iNo2 = 0 ;
    }
    public Maths(int a , int b) // parameterised constructor
    {
       System.out.println("Inside parameterised constructor");
       iNo1 = a ;
       iNo2 = b ;
    }
    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Subtraction()
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}   // end of maths class

class Demo
{
   public static void main(String arr[])
   {
    System.out.println("Inside main function");
    Maths mobj1 = new Maths();  // default
    Maths mobj2 = new Maths(10,11); // parameterised
    int iRet = 0 ;  // jithe lagel tithe variable create krta yeto java madhe
    iRet = mobj1.Addition();
    System.out.println("Addition is : "+iRet);

    iRet = mobj2.Addition();
    System.out.println("Addition is : "+iRet);
   }
}
// there is no destructor in java due to automatic garbage collection
