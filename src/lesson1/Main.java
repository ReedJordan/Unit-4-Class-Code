package lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessMyNumber();

    }

    public static void guessMyNumber(){

        Scanner input = new Scanner(System.in);
        System.out.println("See if you can guess the number!");
        int guess = input.nextInt();

        while (guess != 4){
            System.out.println("Try again!");
            guess = input.nextInt();
        }

        System.out.println("Congratulations, you did it!");

    }
}
