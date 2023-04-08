import java.util.Scanner;

public class books {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("How many books are you buying?:");
    int bookNum = in.nextInt();
    
    System.out.println("What is the price of each book?:");
    double bookPrice = in.nextInt();
    
    double totalBooks = bookNum * bookPrice;
    double tax = totalBooks * 0.13;
    double shipping = bookNum * 2;
    double totalPrice = totalBooks + tax + shipping;
    
    System.out.println("The subtotal is $" + totalBooks + ".");
    System.out.println("The tax is $" + tax + ".");
    System.out.println("The shipping is $" + shipping + ".");
    System.out.println("The total is $" + totalPrice + ".");
  }
}