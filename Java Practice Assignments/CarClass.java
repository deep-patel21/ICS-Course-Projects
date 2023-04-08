public class CarClass {
  private int yearModel;
  private String make;
  private int speed;
  
  public void CarClass() {
    yearModel = 0;
    String make = "";
    speed = 0;
  } 
  
  public int accelerate() {
    speed = speed + 5;
    return speed;
  }
  
  public int brake() {
    speed = speed - 5;
    return speed;
  }
  
  public int getSpeed() {
    return speed; 
  }
  
  public void setSpeed(int s){
    speed = s;
 }
}




