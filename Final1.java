// same as constant characteristics from c++
class Demo
{
   public int No1;

   // java madhe he chalate
   public final int No2 = 11; //const int No2;

   public final int No3; // const int No3;

   public Demo()  // :No2(11), No3(21)
   {
    
    No1 = 10;
    System.out.println("Inside constructor...."+No1);
    No3 = 21;    // NA in C ++
    
   }
}

class Final1
{
    public static void main(String arr[])
    {
        Demo obj = new Demo();
        obj.No1++;
        //obj.No2++;
        //obj.No3++;
    }
}
//variable = able to vary
//data final asel tr value fix aahe mhnje constatnt