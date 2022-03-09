package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * Média 1
 */
public class Bee1005 {
    public static void main(String[] args) throws IOException{
        
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double media = ((a * 3.5) + (b * 7.5))/11;
        System.out.printf("MEDIA = %5.5f\n", media);
    }
}
