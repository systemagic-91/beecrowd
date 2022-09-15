package iniciante;

import java.util.Scanner;

public class Bee1133 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();

        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }

        for (int i = x + 1; i < y; i++) {
            if ((i % 5 == 2) || (i % 5 == 3)) 
                System.out.println(i);
        }
    }
}
