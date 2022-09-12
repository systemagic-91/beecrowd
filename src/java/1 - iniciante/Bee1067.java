package iniciante;

import java.util.Scanner;

public class Bee1067 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= valor; i++) {
            if(i % 2 != 0) System.out.println(i);
        }
    }
}
