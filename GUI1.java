import java.awt.*;
class MarvellousFrame
{
    // independent kele main pasun this is better
    public MarvellousFrame(String title)
    {
       Frame fobj = new Frame(title);

        fobj.setSize(500,500);

        fobj.setVisible(true);
       
    }
}
//event handler nhaiye..bal aahe das basto means event but there is no event handler
class GUI1
{
    public static void main(String arg[])
    {

      MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");

    }
}