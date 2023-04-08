public class Fraction {
  
  private int numerator;
  private int denominator;
  
  public Fraction (int n, int d) {
    numerator = n;
    denominator = d;
  }
  
  public void setNumerator(int newNum) {
    numerator = newNum;
  }
  
  
  public int getNumerator() {
    return numerator;
  }
  
  
  public void setDenominator(int newDen) {
    denominator = newDen;
  }
  
  public int getDenominator() {
    return denominator;
  }
  
  public int sumFractions(Fraction f) {
    System.out.println(numerator + f.getNumerator());
    System.out.println("--");
    System.out.println(denominator * f.getDenominator());
    return numerator;
  }
  
  public void multiplyFractions(Fraction f) {
    System.out.println(numerator * f.getNumerator());
    System.out.println("--");
    System.out.println(denominator * f.getDenominator());
  }
  
  public void divideFractions(Fraction f) {
    System.out.println(numerator * f.getDenominator());
    System.out.println("--");
    System.out.println(denominator * f.getNumerator());
  }
  
  public void subtract Fractions(Fraction f) {
    System.out.println(numerator - f.getNumerator());
    System.out.println("--");
    System.out.println(denominator * f.getDenominator());
  }
}
//program completed