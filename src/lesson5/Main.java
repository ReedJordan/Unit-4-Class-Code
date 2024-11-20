package lesson5;


public class Main {
    public static void main(String[] args) {

        int otherCount = 0;
        int count = 0;
        for (int k = 0; k < 30; k++) {
            if (k % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
        for (int k = 0; k < 30; k += 3) {
            otherCount++;
        }
        System.out.println(otherCount);

        for (int k = 6; k < 50; k++) {
            //statement #1
        }
        //runs 44 times

        for (int k = 0; k < 1000; k++) {
            if (k % 2 == 0) {
                //statement #2
            }
        }
        //runs 500 times

        int k = 1;
        while (k <= 7) {
            for (int z = 0; z < 4; z++) {
                //statement #3
            }
            k++;
        }
        // runs 27 times
    }
}
