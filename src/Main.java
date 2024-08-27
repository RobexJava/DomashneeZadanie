import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;
        int ghoulTearsCount;
        int ravenBonesCount;
        int dumplingsCount;
        System.out.println("\t******Welcom to the Game******");
        System.out.println("You need to make an elixir for your hero.");
        System.out.println("Next, select the number of ingredients for the elixir.");
        System.out.println("""
                Warning! When selecting the number of ingredients,
                do not forget that you need to pay for it.
                And before entering the quantity, look in your wallet
                to see how much money you have.""");
        System.out.println("How many toad eyes do you need?");
        toadEyesCount = (new Scanner(System.in)).nextInt();
        System.out.println("How many virgin's tears do you need?");
        ghoulTearsCount = (new Scanner(System.in)).nextInt();
        System.out.println("How many raven bones do you need?");
        ravenBonesCount = (new Scanner(System.in)).nextInt();
        System.out.println("How many dumplings do you need?");
        dumplingsCount = (new Scanner(System.in)).nextInt();
        boolean loser = true;
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("You will be able to brew the elixir of keen vision!");
            loser = false;
        }

        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("You will have the elixir of fortitude!");
            loser = false;
        }

        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("You can have an elixir of stealth!");
            loser = false;
        }

        if (ghoulTearsCount >= 10 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("You can brew a forbidden elixir!");
            loser = false;
        }

        if (loser) {
            System.out.println("You \"failed\" with elixirs, because you are a loser");
        }

    }
}

