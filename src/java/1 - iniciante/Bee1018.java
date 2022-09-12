package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valor = scan.nextInt();

        scan.close();

        int [] notas = {100, 50, 20, 10, 5, 2, 1};       
        int [] quant_notas = new int[7];
        
        System.out.println((int)valor);

        for (int i = 0; i < quant_notas.length; i++) {            
            quant_notas[i] = (int)(valor / notas[i]);
            valor = valor % notas[i];            
        }        

        for (int i = 0; i < quant_notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d\n", quant_notas[i], notas[i]);
        }
        System.out.println("");
    }
}
