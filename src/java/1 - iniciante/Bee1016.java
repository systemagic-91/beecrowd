package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int distancia = scan.nextInt();
        
        scan.close();

        System.out.println((2*distancia)+" minutos");
    }    
}
