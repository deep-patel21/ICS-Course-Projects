public class Circle {
  
  private double radius = 0;
  
  public double circumference() {
    return 2 * Math.PI * radius;
  }
  
  public double area() {
    return Math.PI * radius * radius; 
  }
  
  public double getRadius() {
    return radius;
  }
  
  public void setRadius(double r) {
    radius = r;
  }
}
