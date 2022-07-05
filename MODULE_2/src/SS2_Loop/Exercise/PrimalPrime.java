package SS2_Loop.Exercise;

public class PrimalPrime {
    public static void main(String[] args) {
        int prime = 0;
        for (int i = 2; prime < 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime++;
                System.out.print(i + " ");
            }
        }
    }
}
