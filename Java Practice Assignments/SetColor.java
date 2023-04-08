import java.awt.*;
import javax.swing.*;

public class SetColor{
  public static void main(String[]args){
    
    UIManager um = new UIManager();
    
    um.put("OptionPane.background",Color.red);
    um.put("Panel.background",Color.red);
    um.put("OptionPane.messageFont", new Font("Broadway",Font.BOLD, 20));
    
    
    JOptionPane.showMessageDialog(null,"Hey Look! The color changed!",
                                  "Set Color", JOptionPane.INFORMATION_MESSAGE);
  }
}
