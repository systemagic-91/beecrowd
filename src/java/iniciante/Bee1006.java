package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Média 2
 */
public class Bee1006 {
    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5))/10;
        System.out.printf("MEDIA = %.1f\n", media);

        scan.close();
    }
}
