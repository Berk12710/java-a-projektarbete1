package dice.game;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        // 1. Skapa en scanner för att kunna läsa in användarinmatningen
        Scanner scanner = new Scanner(System.in);

        // 2. Fråga efter spelarens namn och skapa player-objekt
        System.out.println("Ange namn för spelare 1:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Ange namn för spelare 2:");
        Player player2 = new Player(scanner.nextLine());

        // Skapa en random klass för att stimulera tärnkast
        Random random = new Random();

        // Spelare 1 kastar tärningen två gånger
        System.out.println(player1.getName() + ", tryck på enter för att kasta tärningen.");
        scanner.nextLine();
        int roll1 = random.nextInt(6) + 1;
        System.out.println(player1.getName() + " kastade: " + roll1);
        player1.addScore(roll1);

        System.out.println(player1.getName() + ", tryck på enter för att kasta tärningen igen.");
        scanner.nextLine();
        int roll2 = random.nextInt(6) + 1;
        System.out.println(player1.getName() + " kastade: " + roll2);
        player1.addScore(roll2);

        // Spelare 2 kastar tärningen två gånger
        System.out.println(player2.getName() + ", tryck på enter för att kasta tärningen.");
        scanner.nextLine();
        int roll3 = random.nextInt(6) + 1;
        System.out.println(player2.getName() + " kastade: " + roll3);
        player2.addScore(roll3);

        System.out.println(player2.getName() + ", tryck på enter för att kasta tärningen igen.");
        scanner.nextLine();
        int roll4 = random.nextInt(6) + 1;
        System.out.println(player2.getName() + " kastade: " + roll4);
        player2.addScore(roll4);

        // Visa resultat och avgör vinnaren
        System.out.println(player1.getName() + "s totalpoäng: " + player1.getTotalScore());
        System.out.println(player2.getName() + "s totalpoäng: " + player2.getTotalScore());

        if (player1.getTotalScore() > player2.getTotalScore()) {
            System.out.println(player1.getName() + " vinner!");
        } else if (player1.getTotalScore() < player2.getTotalScore()) {
            System.out.println(player2.getName() + " vinner!");
        } else {
            System.out.println("Det blev oavgjort!");
        }


    }

}
