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

        int secretNum = (int)(Math.random()*10+1);
        while (guess != secretNum){
            System.out.println("Try again!");
            guess = input.nextInt();
        }

        System.out.println("Congratulations, you did it!");
        //hooray
    }
}
