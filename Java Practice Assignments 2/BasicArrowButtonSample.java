import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicArrowButton;

public class BasicArrowButtonSample {
  public static void main(String args[]) {
    
    JFrame frame = new JFrame("Adding Icons to the Dialog Box");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    frame.add(new BasicArrowButton(BasicArrowButton.EAST));
    frame.add(new BasicArrowButton(BasicArrowButton.NORTH));
    frame.add(new BasicArrowButton(BasicArrowButton.SOUTH));
    frame.add(new BasicArrowButton(BasicArrowButton.WEST));
    
    
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setLayout(new GridLayout(0,4));
  }

}