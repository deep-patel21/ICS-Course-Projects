import java.util.Scanner;

public class CarClassMain { 
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    CarClass c1 = new CarClass();
    
    c1.setSpeed(50);
    
    System.out.println(c1.getSpeed());
  }
}