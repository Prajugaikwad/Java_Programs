
interface Circle

{
    //public static final characteristics
    float PI = 3.14f; // PUBLIC STATIC FINAL FLOAT PI = 3.14
    //PI = 3.14f;
    float Area(float Radius); // public static float Area(float Radius)
    float Circumfarance(float Radius);//public static float Circumfarance(float )
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumfarance(float Radius)
    {
        return 2 * PI * Radius ;
    }
}
class InterfaceDemo
{
    public static void main(String Arr[]) // to demonstrate public and static
    {
        System.out.println("Value of PI is: "+Circle.PI);// to demonstrate public and static
        //Circle.PI = 7.12;//to demonstrate final
        Marvellous cobj = new Marvellous();
        float Ret  = 0.0f;
        Ret = cobj.Area(10.5f);
        System.out.println("Area is : "+Ret);
        Ret = cobj.Circumfarance(10.5f);
        System.out.println("Circumfarance is : "+Ret);
    }
}