package mock.player;

public class Player implements Comparable<Player>{
    int score;
    String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Player p1) {
        return this.score-p1.score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
