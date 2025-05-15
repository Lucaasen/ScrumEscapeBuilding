import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    private void menu() {
        System.out.println("Welkom bij S.E.B. (ScrumEscapeBuilding)");
        System.out.println("Wat wil je doen? / Typ de nummer om te selecteren, kies 0(nul) om eruit te gaan");
        System.out.println("1. Start nieuw spel");
        System.out.println("2. Menu");
        System.out.println("3. Credits");
        int choice = scanner.nextInt();

        scanner.nextLine();
        switch (choice) {
            case 1:

                Break;
        }
    }
}

