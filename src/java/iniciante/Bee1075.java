package iniciante;

import java.util.Scanner;

public class Bee1075 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2) System.out.println(i);
        }
    }
}
