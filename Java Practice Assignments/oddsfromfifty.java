public class oddsfromfifty {
  public static void main(String[] args) {
    
  int sum = 49; //declaring the sum value as 49
  /*setting up a for loop starting from fifty and adding 2 to the value of i
   *so it can skip all of the even numbers */
  for(int i = 50; i <= 99; i = i + 2) {
    sum = sum + 2; //adding two to the sum to skip all of the even numbers
    
    System.out.println(sum);//printing the sum until the loop is complete
  }
  }
}
//program completed
  