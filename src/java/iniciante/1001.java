package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * Extremamente Basico
 */
class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println("X = " + (a + b));
    }
}
