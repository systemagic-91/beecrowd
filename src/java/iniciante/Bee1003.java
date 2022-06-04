package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * Soma Simples
 */
public class Bee1003 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        
        System.out.println("X = " + (a + b));
    }
}
