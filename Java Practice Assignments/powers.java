import java.util.Scanner;

public class powers{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("What is the number you would like to calculate for?:");
    int num = in.nextInt();

    double powers = Math.pow(num, 4);

    System.-out.print("The fourth power of the number is " + powers + ".");
  }
}