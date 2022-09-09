package iniciante;

import java.util.Scanner;

public class Bee1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [] valores = new double[3];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }

        scanner.close();

        // ordenacao decrescente
        for (int i = 0; i < (valores.length - 1); i++) {
            
            int maior = i;
            
            int j = (i+1);

            for (; j < valores.length; j++) {
                if(valores[j] > valores[maior]){
                    maior = j;
                }
            }

            double aux = valores[i];
            valores[i] = valores[maior];
            valores[maior] = aux;
        }

        double A = valores[0];
        double B = valores[1];
        double C = valores[2];
        
        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == (Math.pow(B, 2)) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > (Math.pow(B, 2)) + Math.pow(C, 2)){
            
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < (Math.pow(B, 2)) + Math.pow(C, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(A == B && A == C){
            System.out.println("TRIANGULO EQUILATERO");
        }

        if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
