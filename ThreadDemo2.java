class Demo implements Runnable
{

    public void run() 
    {
      int i = 0;
      for(i = 1; i< 10 ; i++)
       {
        System.out.println(i);
       }
    }
}

class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);

//ji method nahiye tila call kela 
//aani ji aahe tila call nahi kela
        t1.setName("C thread");
        t1.setName("C++ thread");
        
        t1.start();//thread tayar
        t2.start();// internally run call
    }
}
//start method internally calls run method
// execution time for executing
// every thread is different:ex: eyes checking 
//for adult and children taking diffrent time
//switching time : context switch
// 2 thread la same kaam run method 
//that is 1 to 10 display is same for T1 and T2
//random output for everyone 
// we cant predict which thread comes first
// time quantum: eka thread la dilela vel