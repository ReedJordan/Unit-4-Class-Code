package lesson3;

/*
The stuff that I need to add after watching the videos.
 */
public class Main {
    public static void main(String[] args){
        substringFinder()
    }
    public class substringFinder(){

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
}
