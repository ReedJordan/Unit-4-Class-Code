package homework3;

import java.util.Scanner();

/*
Making the game WOODLE in code.
 */

public class Unit4HW3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myWord = "GHOST";
        String firstChar = myWord.substring(0,1);
        String secondChar = myWord.substring(1,2);
        String thirdChar = myWord.substring(2,3);
        String fourthChar = myWord.substring(3,4);
        String fifthChar = myWord.substring(4,5);

        System.out.println("Guess a five letter word! *all caps");
        String userWord = input.nextLine();
        String guessOne = userWord.substring(0,1);
        String guessTwo = userWord.substring(1,2);
        String guessThree = userWord.substring(2,3);
        String guessFour = userWord.substring(3,4);
        String guessFive = userWord.substring(4,5);

    }
}
