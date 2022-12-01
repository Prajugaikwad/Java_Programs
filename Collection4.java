import java.util.*;

class Collection4
{
    public static void main(String arg[])
    {
        ArrayList<Float>aobj = new ArrayList<Float>();
        aobj.add(10.6f);
        aobj.add(20.6f);
        aobj.add(30.6f);
        aobj.add(40.6f);
        aobj.add(50.6f);

        //aobj.addFirst(1.60); this method is not available
        //aobj.addLast(1.60);//aadhi madhi kadhaghal karu nahi det

        //sadha array:restriction(you cant do anything,cant remove , cant add,),but too fast accessing
        //arrayList:combo of array and LL , medium flexibility
        //LL:not fast accessing bcz you have to travel,flexible but slow due to it give features
        //vector:
        // all above for store data, homogeneous data

        Iterator iobj = aobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
         aobj.clear();
    }
}
// arrayList: not manipulation, fastest access(time)
//LinkedList:java.util, functionality manipulation,(time more),