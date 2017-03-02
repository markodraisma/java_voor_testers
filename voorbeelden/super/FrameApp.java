import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameApp extends Frame 
{
   Button knop;
   TextField tekst;
   Label label;

  FrameApp()
  {
    super("Dit is een voorbeeld applicatie");
    setLayout(null);
    knop = new Button("Knop");
    add(knop).setBounds(10,30,80,20);;
    tekst = new TextField();
    add(tekst).setBounds(10,60,100,20);;
    label = new Label("Dit is een label");
    add(label).setBounds(10,90,100,20);
    setSize(300,200);
    maakSluitbaar();
    show();
  }

  public static void main(String args[])
  {
    new FrameApp();
  }

  void maakSluitbaar()
  {
    addWindowListener 
    (
      new WindowAdapter()
      {
        public void windowClosing(WindowEvent e)
        {
          System.exit(0);
        }
      }
    );
  }

 

}