public class CashRegister {
  private int itemCount;
  private double totalPrice;
  
  public CashRegister() {
    itemCount = 0;
    totalPrice = 0;
  }
  
  public int getCount() {
    itemCount = itemCount + 1;
    return itemCount;
  }
  
  public double getTotal() {
    return totalPrice;
  }
  
  public void addItem(double price) {
    while(itemCount < itemCount + 1);
    itemCount = itemCount + 1;
    
    
  }
  
  public void clear() {
     setTotalPrice(0);
    
    
  }
}
