
//abstarct class is a class which contains 
//0 or more abstract method in it
//jar tumhala tumchya class cha object tayar 
//hou nahi dyaycha tenva class chya aadhi abstract
abstract class Arithematic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1, int No2);
}
//respnsibiliti of derived class to provide 
//defination to abstact method substraction
class Marvellous extends Arithematic
{
    public int Substraction(int No1, int No2)
    {
        return No1 - No2;
    }
}
class AbstractDemo
{
    public static void main(String Arr[])
    {
    //Arithematic aobj = new Arithematic(); //NA
       Marvellous mobj = new Marvellous(); //Allowed
       int Ret = 0;

       Ret = mobj.Addition(11,10);
       System.out.println("Addition is: "+Ret);

       Ret = mobj.Substraction(11,10);
       System.out.println("Substraction is: "+Ret);
       
    }

}