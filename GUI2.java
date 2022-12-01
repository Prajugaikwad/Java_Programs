import java.awt.*;
import java.awt.event.*;
class MarvellousFrame
{
    // independent kele main pasun this is better
    public MarvellousFrame(String title)
    {
       Frame fobj = new Frame(title);

        fobj.setSize(500,500);

        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener implements WindowListener
{

   public void windowDeactivated(WindowEvent obj) {} 
   public void windowActivated(WindowEvent obj) {} 
   public void windowDeiconified(WindowEvent obj) {} 
   public void windowIconified(WindowEvent obj) {} 
   public void windowClosed(WindowEvent obj) {}
   public void windowClosing(WindowEvent obj) 
   {
     System.exit(0);
   }
   public void windowOpened(WindowEvent obj) {}  
}
//event handler nhaiye..bal aahe das basto means event but there is no event handler
class GUI2
{
    public static void main(String arg[])
    {

      MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");

    }
}