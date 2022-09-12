package iniciante;

import java.util.Scanner;

public class Bee1079 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double v1 = scanner.nextDouble() * 2;
            double v2 = scanner.nextDouble() * 3;
            double v3 = scanner.nextDouble() * 5;

            System.out.printf("%.1f%n", ((v1 + v2 + v3)/(10)));
        }

        scanner.close();


    }
}
