public class CircleMain {
  public static void main(String[] args) {
    
    Circle c1 = new Circle();
    Circle c2 = new Circle();
    
    c1.setRadius(5.0);
    
    System.out.println(c2.getRadius());
    
    c2.setRadius(3.5);
    
    double area1 = c1.area();
    double area2 = c2.area();
    
    System.out.println(area1);
    System.out.println(area2);
    
  } 
}

