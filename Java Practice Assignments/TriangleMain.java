public class TriangleMain {
  public static void main(String[] args) {
    
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();
    
    t1.setBase(5);
    t2.setBase(7);
    
    System.out.println(t1.getRadius());
    System.out.println(t2.getRadius());
    
    t1.setHeight(3);
    t2.setHeight(9);
    
    int area1 = t1.area();
    int area2 = t2.area();
    
    System.out.println(area1);
    System.out.println(area2);
  }
}