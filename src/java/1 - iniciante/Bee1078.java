package iniciante;

import java.util.Scanner;

public class Bee1078 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, n, (i*n));
        }
    }
}
