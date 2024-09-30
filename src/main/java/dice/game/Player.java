package dice.game;

public class Player {

    private String name;
    private int totalScore;

    // Konstruktor för att sätta spelarens namn samt initialiserar poängen till 0
    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    // Metod för att få spelarens namn
    public String getName() {
        return name;
    }

    //Metod för att få spelarens totala poäng
    public int getTotalScore() {
        return totalScore;
    }

    // Metod för att lägga till poäng till spelaren
    public void addScore(int score) {
        this.totalScore += score;
    }
}


