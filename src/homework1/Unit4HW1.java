package homework1;
import java.util.Random;
import java.util.Scanner;


public class Unit4HW1 {

    public static void main(String[] args) {
        //guessingGame();
        //tiredTurtle();
        tomaNOTchi();

    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     */
    public static void guessingGame() {
        //feel free to use the Random class
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int pickMe = random.nextInt(0, 100);
        System.out.println("I have a random number, between 1 and 100! Can you guess what it is?");
        System.out.println("Enter your number: ");
        int userGuess = input.nextInt();
        while (userGuess != pickMe) {
            if (userGuess > pickMe) {
                System.out.print("Your guess is too high! ");
            } else {
                System.out.print("Your guess is too low! ");
            }
            System.out.println("Guess again: ");
            userGuess = input.nextInt();
        }
        System.out.println("Hooray! You got it!");
    }

    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     */
    public static void tiredTurtle() {
        Scanner turt = new Scanner(System.in);
        System.out.println("This turtle may be tired, but it has to move. How many steps should it take?");
        int stepChoice = turt.nextInt();
        int moveNum = 0;
        int moveTot = 0;
        int numSteps = stepChoice;

        while (numSteps > 1){
            moveNum ++;
            System.out.println("Move "+ moveNum +": "+ numSteps +" steps.");
            moveTot += numSteps;
            numSteps = (int)(numSteps/2);
        }

        System.out.println("\nFirst move: "+ stepChoice);
        System.out.println("Total steps: "+ moveTot);
    }

    public static void tomaNOTchi() {
        Scanner toma = new Scanner(System.in);
        int hourNum = 0;
        int hungLevel = 10;
        String feedIt = "no";
        System.out.println("Hour 0: Current hunger level 0.");
        while (hourNum <= 3){
            hourNum++;
            System.out.print("Hour "+ hourNum +": Current hunger level is "+ hungLevel +". ");
            System.out.print("Do you want to feed your pet? (yes/no) ");
            feedIt = toma.nextLine();
            if (feedIt.equals("yes")){
                if (hungLevel <= 25){
                    hungLevel = 0;
                }else if (hungLevel > 25){
                    hungLevel -= 25;
                }
            }
            hungLevel += 10;
        }
        String petStatus = "content";
        if (hungLevel >= 40){
            petStatus = "dead";
        }
        System.out.println("Hour "+ (hourNum+1) +": Current hunger level is "+ hungLevel +". ");
        System.out.print("End of simulation. Your pet is "+ petStatus +". ");
    }

}