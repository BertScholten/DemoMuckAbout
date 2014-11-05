/**
 * 
 */
package nl.dat.demo.muckabout;

import nl.dat.demo.muckabout.misc.ScoreBoard;
import junit.framework.TestCase;

/**
 * @author Bertje
 *
 */
public class BallyTest extends TestCase {

  /**
   * Test method for {@link nl.dat.demo.muckabout.Bally#getTopDog()}.
   */
  public void testGetTopDog() {
    Bally bally = new Bally();
    Player boy = bally.addPlayer("TestBoy");
    Player man = bally.addPlayer("TestMan");
    boy.setScore(10);
    man.setScore(100);
    Player winner = bally.end();
    assertEquals("Winner should be the man", man, winner);
  }

  public void testHighScore() {
    Bally bally = new Bally();
    Player boy = bally.addPlayer("TestBoy");
    Player man = bally.addPlayer("TestMan");
    boy.setScore(10);
    man.setScore(200);
    bally.showHighScore();
    assertEquals("High score", 200, ScoreBoard.getHighScore());
  }
  
  public void mmmmmmtest() {
    fail("It's a guaranteed fail!");
  }

}
