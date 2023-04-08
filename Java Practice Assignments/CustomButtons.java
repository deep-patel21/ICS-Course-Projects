import javax.swing.JOptionPane;

public class CustomButtons {
  public static void main(String[] args) {

    String[] buttons = { "Of course", " it is a", "wonderful", "example" };

    int rc = JOptionPane.showOptionDialog(null, "This is a great example, right?", "Custom Buttons Everywhere!",
        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

    System.out.println(rc);

  }
}