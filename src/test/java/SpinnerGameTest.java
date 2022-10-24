

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpinnerGameTest {

  @Test
  void testSpinPlayer() {
    SpinnerGame player = new SpinnerGame();
    assertTrue(player.spin(1,10) >= 1 && player.spin(1,10) <= 10);
  }
  
  @Test
  void testSpinComputer() {
    SpinnerGame computer = new SpinnerGame();
    assertTrue(computer.spin(2,8) >= 2 && computer.spin(2,8) <= 8);
  }
  
  
  

}
