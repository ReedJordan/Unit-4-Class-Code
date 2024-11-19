package homework2;

import java.util.Scanner;

public class Unit4HW2 {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str) {
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        String counted = str;
        
        for (x = 0; x < counted.length(); x++){
            String isA = counted.substring(x, x + 1);
            if (isA.equals("a") || isA.equals("A")){
                aCount++;
            }
        }
        
        for (x = 0; x < counted.length(); x++){
            String isE = counted.substring(x, x + 1);
            if (isE.equals("e") || isE.equals("E")){
                eCount++;
            }
        }
        
        for (x = 0; x < counted.length(); x++){
            String isI = counted.substring(x, x + 1);
            if (isI.equals("i") || isI.equals("i")){
                iCount++;
            }
        }
        
        for (x = 0; x < counted.length(); x++){
            String isO = counted.substring(x, x + 1);
            if (is).equals("o") || isO.equals("O")){
                oCount++;
            }
        }
        
        for (x = 0; x < counted.length(); x++){
            String isU = counted.substring(x, x + 1);
            if (isU.equals("u") || isU.equals("U")){
                uCount++;
            }
        }
        
        System.out.println("Number of a's: "+ aCount);
        System.out.println("Number of e's: "+ eCount);
        System.out.println("Number of i's: "+ iCount);
        System.out.println("Number of o's: "+ oCount);
        System.out.println("Number of u's: "+ uCount);

    }

    public static void palindromeChecker(String str) {
        
    }
}
