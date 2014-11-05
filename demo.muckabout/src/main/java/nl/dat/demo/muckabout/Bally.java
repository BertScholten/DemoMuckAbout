package nl.dat.demo.muckabout;

import java.util.ArrayList;
import java.util.List;

import nl.dat.demo.muckabout.misc.ScoreBoard;

/**
 * It's the bally machine!
 */
public class Bally {

  private final List<Player> players = new ArrayList<>();
  public static int highscore = 0;

  public Player addPlayer(String name) {
    Player player = new Player(name);
    players.add(player);
    return player;
  }

  public Player getTopDog() {
    //pretty weird way to determine the top player at the moment. Why not let Player be Comparable and sort the original list? Do we want to keep the order in which players are added or something? And what if there are players with the same score? Guess this line is long enough now to give SonarQube some headaches...
    return players.stream()
        .sorted((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()))
        .findFirst().get();
  }
  
  public Player end() {
    Player winner = getTopDog();
    if (winner == null) {
      System.out.println("Error: No winner");
    } else if (winner.getScore() > highscore) {
      System.out.println("There's a new all-time-high score, claimed by: " + winner.getName());
      highscore = getTopDog().getScore();
    }
    return winner;
  }

  public void showHighScore() {
    System.out.println(ScoreBoard.getHighScore());
  }

}
