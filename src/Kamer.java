public class Kamer {
    private String doel;
    private String informatie;
    private String opdracht;
    private int kamerNummer;
    private Monster monster;
    private Deur deur;
    private KamerType kamerType;

    public Kamer(String doel, String informatie, String opdracht, int kamerNummer, KamerType kamerType) {
        this.doel = doel;
        this.informatie = informatie;
        this.opdracht = opdracht;
        this.kamerNummer = kamerNummer;
        this.monster = null;
        this.deur = new Deur();
        this.kamerType = kamerType;
    }

    public KamerType getKamerType() {
        return this.kamerType;
    }

    public void spawnMonster(String naam, String reden) {
        this.monster = new Monster(naam, reden);
        monster.toonMonster();
    }

    public boolean isGeblokkeerd() {
        return monster != null && monster.isActief();
    }

    public void verslaMonster() {
        if (monster != null) {
            monster.versla();
        }
    }
}
