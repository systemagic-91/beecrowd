package iniciante;

import java.util.Scanner;

/**
 * Bee1153
 */
public class Bee1153 {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fatorial = 1; // fatorial de 0 = 1

        for (int i = n; i >= 1; i--) 
            fatorial *= i;
        
        System.out.println(fatorial);

        scanner.close();
    }
}