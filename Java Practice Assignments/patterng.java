public class patterng {
  public static void main(String[] args) {
    
    String num = "1235678";
    
    for(int j = 9; j >1; j--) {
      System.out.println();
      for(int i = 1; i < j; i++)
        System.out.print(num.substring(0,9));
    }
  }
}

        