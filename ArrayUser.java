import java.util.Scanner;


class ArrayUser
{
    int iNo1;
    int iNo2;
    public static void main(String Arg[])
    {
     int iCnt = 0;
     Scanner sobj = new Scanner (System.in) ;

     System.out.println("Enter the size of an array : ");
     int iSize = sobj.nextInt();
      
      // int Arr[] = (int *)malloc(iSize sizeof(int));
     int Arr[] = new int[iSize];

     System.out.println("Number of elements in the array are:"+Arr.length);

     System.out.println("Enter the size of an array : ");
     for(iCnt = 0; iCnt<Arr.length; iCnt++)
     {
       Arr[iCnt] = sobj.nextInt();
     }

     System.out.println("Elements of an array : ");
     for(iCnt = 0; iCnt<Arr.length; iCnt++)
     {
       System.out.println(Arr[iCnt]);
     }
      
     for(iCnt = 0; iCnt<Arr.length; iCnt++)
     {
        iAns = iNo1 + iNo2;
     }
     
    
    }
}