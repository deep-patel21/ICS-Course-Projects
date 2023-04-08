public class FractionMain {
  public static void main(String[] args) {
    
    Fraction f1 = new Fraction(1,5);
    Fraction f2 = new Fraction(3,7);
   
    
    f1.sumFractions(f2);
    System.out.println("\n");
    
    f1.multiplyFractions(f2);
    System.out.println("\n");
    
    f1.divideFractions(f2);
    System.out.println("\n");
    
    f1.subtractFractions(f2);
    
    
  }
}