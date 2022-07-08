package ss2_loop.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int prime = 0;
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime = i;
                System.out.print(prime + " ");
            }
        }
    }
}
