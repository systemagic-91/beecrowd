package iniciante;

import java.util.Scanner;

public class Bee1066 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {   

            int valor = scanner.nextInt();

            if (valor % 2 == 0) pares++;
            if (valor % 2 != 0) impares++;
            if (valor > 0) positivos++;
            if (valor < 0) negativos++;            
        }

        scanner.close();

        System.out.println(pares + " valor(es) par(es)");  
        System.out.println(impares + " valor(es) impar(es)");  
        System.out.println(positivos + " valor(es) positivo(s)");  
        System.out.println(negativos + " valor(es) negativo(s)");  
    }
}
