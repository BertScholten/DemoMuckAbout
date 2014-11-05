package nl.dat.demo.muckabout;

/**
 * A player on the bally machine.
 */
public class Player {

  private String Name;
  private int score;

  public Player(String name) {
    this.Name = name;
  }

  public String getName() {
    return Name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

}
