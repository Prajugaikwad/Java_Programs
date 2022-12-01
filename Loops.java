class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of array using for loop");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal of an array using while loop");

        iCnt = 0;  //reinitialise

        // front condition checking 
        while(iCnt<Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
        

        System.out.println("Traversal of array using do-while loop");
        iCnt = 0;
        Do
        {
           System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt<Arr.length)
        
        // pratyek element parynt janara
        // there is no counter 
        // first loop pasun last element parynat firtoch
        // break krta yeto 
        System.out.println("Traversal of array using for-each loop");
        for(int iNo : Arr)   // only in java
        {
            System.out.println(iNo);
        }
    }
}

// for each= Aalashi  loop






