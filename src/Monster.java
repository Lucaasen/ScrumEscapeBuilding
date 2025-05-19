public class Monster {
    private int levens;
    private String naam;
    private String reden;
    private boolean actief;

    public Monster(String naam, String reden) {
        this.naam = naam;
        this.reden = reden;
        this.levens = 1;
        this.actief = true;
    }

    public void toonMonster() {
        System.out.println("⚠️ Monster verschenen: " + naam);
        System.out.println("Belemmering: " + reden);
    }

    public boolean isActief() {
        return actief;
    }

    public void versla() {
        this.actief = false;
        System.out.println("✅ Je hebt het monster '" + naam + "' verslagen!");
    }

    public void schade(int hoeveelheid) {
        levens -= hoeveelheid;
        if (levens <= 0) {
            versla();
        }
    }
}
