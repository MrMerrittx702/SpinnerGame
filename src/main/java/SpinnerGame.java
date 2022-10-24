
public class SpinnerGame {
  
  /** Precondition: min < max
   * Simulates a spin of a spinner by returning a random integer between min and max, inclusive. (a)*/
  public int spin(int min, int max) { 
    /* to be implemented in part (a) */
    
  }
  
  /** Simulates one round of the game as described in part (b). */
  public void playRound(){ 
    /* to be implemented in part (b) */ 
    
  }
  
  //Used to test the playRound method.(Do not remove)
  public void testPlayRound() {
    for (int i = 0; i < 1000; i ++) {
      playRound();
    }
  }
  
  public static void main(String[] args) { 
    
   //testing playRound method (Do not remove)
   SpinnerGame game = new SpinnerGame();
   game.testPlayRound();
  }
