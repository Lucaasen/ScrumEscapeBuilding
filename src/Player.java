import java.util.List;

public class Player {
    String positie;
    String status;
    int hp;
    double voortgang;
    Inventaris inventaris = new Inventaris();
    double score;

    public Player(String positie, String status, int hp, double voortgang, Inventaris inventaris, double score) {
        this.positie = positie;
        this.status = status;
        this.hp = hp;
        this.voortgang = voortgang;
        this.inventaris = inventaris;
        this.score = score;
    }

    public static void Player(String[] args) {
        new Voortgang();

        new Deur();

        new Kamer();
    }
}
class Inventaris {
    List<Inventaris> inventaris;
}
