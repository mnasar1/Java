import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        boolean playagain = true;

        int comp1 = ra.nextInt(3);
        System.out.println("Lets play Rock Paper Scissors");

        while (playagain) {


            System.out.println("Please enter your input");


            String user = sc.nextLine().toLowerCase();
            String robo = "";

            if (comp1 == 0) {
                robo = "rock";

            } else if (comp1 == 1) {
                robo = "paper";

            } else if (comp1 == 2) {
                robo = "scissors";
            } else {
                System.out.println("invalid move.");

            }
            System.out.println("Robo move: " + robo);

            if (user.equals(robo)) {
                System.out.println("tie");
            } else if (user.equals("paper")) {
                if (robo.equals("rock")) {
                    System.out.println("you win ; paper covers rock");

                } else {
                    System.out.println("you lose");


                }
            } else if (user.equals("scissors"))
                if (robo.equals("paper")) {
                    System.out.println("you win : Scissors cut paper");

                } else {
                    System.out.println("you lose.");

                }
            else if (user.equals("rock")) {
                if (robo.equals("scissors")) {
                    System.out.println("you win : rock crushes scissors");

                } else {
                    System.out.println("you lose : paper cover rock.");
                    {

                    }
                }
            } else {
                System.out.println("invalid input");
            }

            System.out.println("you want to play again  (y/n)");


            playagain = sc.nextLine().equalsIgnoreCase("y");


        }
    }
}









