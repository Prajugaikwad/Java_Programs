class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;
    public Employee(int No, String str, int value)
    {
        this.id  = No;
        this.name =str;
        this.Salary = Value;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
class CloneDemo
{
   public static void main(String A[])  
   {
    TRY
    {
      Employee eobj1 = new Employee(101,"Rahul",11000);
      Employee eobj2 = (Employee)eobj1.clone();
      System.out.println("Name of first employee:"+eobj1.Name);
      System.out.println("Name of first employee:"+eobj2.Name);

     System.out.println("Name of first employee:"+eobj1.Salary);
     System.out.println("Name of first employee:"+eobj2.Salary);
   //naw change kele ethe
     System.out.println("Name of first employee:"+eobj1.Name);
      System.out.println("Name of first employee:"+eobj2.Name);

   }
   clone(CloneNotSupportedException obj)
   {}

   }
}