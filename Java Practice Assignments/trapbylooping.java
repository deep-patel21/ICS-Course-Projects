public class trapbylooping {
  public static void main(String[] arg) {
  
   for(int j = 5; j < 9; j++) { //this for loop indicates how many times the next loop is going to run.
     System.out.print("\n"); //this control character is used to go to the next line insteasd of printing them all on the same line.
     for(int i = 4; i < j ; i++ ) { //this loop compared i with the newest update of j value. i = 4 indicated 4 lines printed.
       System.out.print("**"); //two symbols are placed since each line has two more added asterisks.
     } //first for loop ends
    } //second for loop ends
  }
}
//program complete

 


    