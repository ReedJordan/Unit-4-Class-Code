package lesson4;


public class Main {
    public static void main(String[] args){
        
        for (int outer = 1; outer < 5; outer++){
            for (int inner = 1; inner < 3; inner ++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        
        
        for (int outer = 1; outer < 5; outer++){
            for (int inner = 1; inner <= outer; inner++){
            System.out.print("*");
            }
        System.out.println();
        }

        for(int outer = 4; outer >= 1; outer--){
            for (int inner = outer; inner > 0; inner--){
                System.out.print("*");
            }
        System.out.println();
        }

        
        //Double While loops:
        int result = 0;
        int k = 0;
        while(k < 4){
            int m = 0;
            while (m < 3){
                result++;
                m++
            }
        k++;
        }
        System.out.println(result);
        
        
    }

}
