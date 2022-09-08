package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Bee1017 {
 
    public static void main(String[] args) throws IOException {
         
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double tempo_gasto_viagem = scan.nextInt();
        double velocidade_media = scan.nextInt();

        scan.close();

        double litros_necessarios = (tempo_gasto_viagem*velocidade_media)/12;        
        
        System.out.printf("%.3f%n", litros_necessarios); 

    }
 
}