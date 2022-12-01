import javax.swing.*;
import java.awt.event.*;
class MarvellousFrame
{
    // independent kele main pasun this is better
    public MarvellousFrame(String title)
    {
        // jframe for swing and frame for awt
       JFrame fobj = new JFrame(title);

        fobj.setSize(500,500);

        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener extends WindowAdapter//jya method nakoyat tya remove krta yetil
{
   public void windowClosing(WindowEvent obj) 
   {
     System.exit(0);
   }
   
}
//event handler nhaiye..bal aahe das basto means event but there is no event handler
class GUI5
{
    public static void main(String arg[])
    {

      MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");

    }
}