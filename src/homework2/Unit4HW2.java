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
        int x = 0;
        
        for (x = 0; x < counted.length(); x++){
            String isVowel = counted.substring(x, x + 1);
            if (isVowel.equals("a") || isVowel.equals("A")){
                aCount++;
            }else if (isVowel.equals("e") || isVowel.equals("E")){
                eCount++;
            }else if (isVowel.equals("i") || isVowel.equals("I")){
                iCount++;
            }else if (isVowel.equals("o") || isVowel.equals("O")){
                oCount++;
            }else if (isVowel.equals("u") || isVowel.equals("U")){
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
        String checkered = str;
        String spaceless = "";
        String singular = "";
        String reversed = "";
        String single = "";
        char validChecker = ' ';
        int charAscii = 0;
        boolean invalid = false;
        
        for (int i = 0; i < checkered.length(); i++){
            singular = checkered.substring(i, i + 1);
            validChecker = checkered.charAt(i);
            charAscii = validChecker;
            
            if (charAscii != 32){
                spaceless = spaceless + singular;
            }
            if ((33 <= charAscii && charAscii <= 64) || (91 <= charAscii && charAscii <= 96) || (123 <= charAscii)){
                invalid = true;
                break;
            }
        }
        
        for (int p = 0; p < spaceless.length(); p++){
            single = spaceless.substring(p, p + 1);
            reversed = single + reversed;
        }

        if (invalid){
            System.out.println("Error: Invalid character found in "+ checkered);
        }else if (reversed.equals(spaceless)){
            System.out.println(checkered +" is a palindrome.");
        }else{
            System.out.println(checkered +" is not a palindrome.");
        }
        
    }
}
