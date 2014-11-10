/**
 * 
 */
package nl.dat.demo.muckabout;

import nl.dat.demo.muckabout.misc.ScoreBoard;
import junit.framework.TestCase;

/**
 *
 */
public class BallyTest extends TestCase {

  /**
   * Testing expected winner at end.
   */
  public void testEnd() {
    Bally bally = new Bally();
    Player boy = bally.addPlayer("TestBoy");
    Player man = bally.addPlayer("TestMan");
    boy.setScore(10);
    man.setScore(100);
    Player winner = bally.end();
    assertEquals("Winner should be the man", man, winner);
  }


  /**
   * Testing expected high score.
   */
  public void testHighScore() {
    Bally bally = new Bally();
    Player boy = bally.addPlayer("TestBoy");
    Player man = bally.addPlayer("TestMan");
    boy.setScore(10);
    man.setScore(200);
    bally.showHighScore();
    bally.end();
    assertEquals("High score", 200, ScoreBoard.getHighScore());
  }

}
