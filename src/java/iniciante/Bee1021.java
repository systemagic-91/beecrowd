package iniciante;

import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        

        double valor = scan.nextDouble();
        
        int parte_inteira = (int)valor;
        int parte_fracionaria = (int)((valor - parte_inteira)*100);        

        scan.close();

        int [] notas = {100, 50, 20, 10, 5, 2};       
        int [] quant_notas = new int[6];

        int [] moedas = {50, 25, 10, 5, 1};
        int [] quant_moedas = new int[5];

        System.out.println("NOTAS:");

        for (int i = 0; i < quant_notas.length; i++) {            
            quant_notas[i] = parte_inteira / notas[i];
            parte_inteira = parte_inteira % notas[i];            
        }        
        
        for (int i = 0; i < quant_notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d.00\n", quant_notas[i], notas[i]);
        }            
        
        System.out.println("MOEDAS:");
        System.out.println(parte_inteira + " moeda(s) de R$ 1.00");
        
        for (int i = 0; i < quant_moedas.length; i++) {            
            quant_moedas[i] = parte_fracionaria / moedas[i];
            parte_fracionaria = parte_fracionaria % moedas[i];            
        }        

        for (int i = 0; i < quant_moedas.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", quant_moedas[i], (moedas[i]/100.00));
        }       
    }
}
