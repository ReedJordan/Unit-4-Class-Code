package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numberGuess();
        Scanner scan = new Scanner(System.in);


        int startValue = 0;
        while (startValue < 10) {
            System.out.println(startValue);
            startValue++;
        }

        while (true) {
            System.out.println("Enter a number: ");
            int userNum = scan.nextInt();
            if (userNum == 8) {
                break;
            }
        }
    }

    public static void numberGuess() {

        Scanner input = new Scanner(System.in);
        System.out.println("See if you can guess the number!");
        int guess = input.nextInt();

        int secretNum = (int) (Math.random() * 10 + 1);
        while (guess != secretNum) {
            System.out.println("Try again!");
            guess = input.nextInt();
        }

        System.out.println("Congratulations, you did it!");

    }
}