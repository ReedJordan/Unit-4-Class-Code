package homework3;

import java.util.Scanner;

/*
Making the game WOODLE in code.
 */

public class Unit4HW3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String singleChar = "";
        int rightPlace = 0;
        int wrongPlace = 0;
        int i = 0;
        String userWord = "peepeepoopoo";

        String myWord = "GHOST";
        String firstChar = myWord.substring(0, 1);
        String secondChar = myWord.substring(1, 2);
        String thirdChar = myWord.substring(2, 3);
        String fourthChar = myWord.substring(3, 4);
        String fifthChar = myWord.substring(4, 5);

        while (!(userWord.equals(myWord))) {

            rightPlace = 0;
            wrongPlace = 0;


            System.out.println("Guess a five letter word! *all caps");
            userWord = input.nextLine();

            if (userWord.length() != 5) {
                System.out.println("Error: Incorrect number of letters. Start again.");
                System.exit(0);
            }

            String guessOne = userWord.substring(0, 1);
            String guessTwo = userWord.substring(1, 2);
            String guessThree = userWord.substring(2, 3);
            String guessFour = userWord.substring(3, 4);
            String guessFive = userWord.substring(4, 5);


            for (i = 0; i < 5; i++) {
                singleChar = myWord.substring(i, i + 1);
                if (guessOne.equals(singleChar) || guessTwo.equals(singleChar) || guessThree.equals(singleChar) || guessFour.equals(singleChar) || guessFive.equals(singleChar)) {
                    wrongPlace++;
                }
            }

            if (guessOne.equals(firstChar)) {
                rightPlace++;
                wrongPlace--;
            }
            if (guessTwo.equals(secondChar)) {
                rightPlace++;
                wrongPlace--;
            }
            if (guessThree.equals(thirdChar)) {
                rightPlace++;
                wrongPlace--;
            }
            if (guessFour.equals(fourthChar)) {
                rightPlace++;
                wrongPlace--;
            }
            if (guessFive.equals(fifthChar)) {
                rightPlace++;
                wrongPlace--;
            }

            System.out.println(rightPlace + " letters in the correct spot.");
            System.out.println(wrongPlace + " letters in the wrong spot.");

        }
    }
}
