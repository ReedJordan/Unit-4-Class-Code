package lesson3;

/*
The stuff that I need to add after watching the videos.
 */
public class Main {
    public static void main(String[] args){
        substringFinder();
        substringNumbers();
        substringReverser();
    }
    
    public static void substringFinder(){

        String word = "sunflower";
        String sub = "lower";
        boolean found = false;
        for (int i = 0; i <= word.length() - sub.length(); i++){
            String portion = word.substring(i, i + sub.length());
            if (portion.equals(sub)){
                found = true;
            }
        }
        if (found){
            System.out.println("We found the smaller String!");
        }else{
            System.out.println("We did not find the smaller String.");
        }
    }

    public static void substringNumbers(){
        String word = "supercalifragilisticexpialidocious";
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            String letter = word.substring(i, i+1);
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || 
                letter.equals("o") || letter.equals("u")){

                count++;
            }
        System.out.println("The number of vowels in "+ word +" is "+ count);
    }
    
    public static void substringReverser(){
        String original = "backwards";
        String reversed = "";
        for (int i = 0; i < original.length(); i++){
            String single = original.substring(i, i + 1);
            reversed = single + reversed;
        }
        System.out.println("Original String: "+ original);
        System.out.println("Reversed String: "+ reversed);
        
    }
}
