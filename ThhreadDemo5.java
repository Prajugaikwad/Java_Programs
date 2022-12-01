//jar tumcha class konala inherit karat nsel tr
class Demo extends Threads
{
   public void run() 
    {
      int i = 0;
      for(i = 1; i<=10; i++)
       {
        try
        {
         System.out.println(Thread.currentThread().getName()+":"+i);
         // waiting for no reason 
         //fixed aahe alarm lavun zopne
         Thread.sleep(500); //you can perform other task till sleep
        }
        catch(InterruptedException obj)
        {}
       }
    }
}

class ThreadDemo5
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);// 5 Sec
        Thread t2 = new Thread(obj2);// 5 Sec

      //ji method nahiye tila call kela 
      //aani ji aahe tila call nahi kela
        t1.setName("First thread");
        t1.setName("Second thread");
        
        t1.start();//thread tayar
        t2.start();// internally run call

        // waiting for some reason sir thamblele
        t1.join();// code pause
        t2.join();//ya 2 method mul khalch ru zal
       System.out.println("End of main method");
    }
}
// start kele thread la
//t1 smpeparyant khali jauch deych nahi 
//same t2 ch 
// nantr mg 
//smja monday la mall madhe 