import java.util.Scanner;

public class drawer {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
 
  boolean condition = true;
  String[] items = {"pen", "dime", "book", "toycar", "socks", "notebook"};
  

  System.out.println("What are you looking for: ");
  String user = in.next();
 
  
  while(condition = false) {
    System.out.println("What are you looking for ");
    String users = in.next();
  }
 
  if(user.equals(user)) {
    condition = true;
    System.out.println("There is a " + items + " in the drawer.");
  }
 
  else { 
    condition = false;
    System.out.println("There is no " + items + " in the drawer. ");
  }
  }
  }
