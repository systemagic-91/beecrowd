package iniciante;

import java.util.Scanner;

public class Bee1118 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                
        
        double nota1, nota2;

        int op = 1;

        while (op == 1) {            

            nota1 = scanner.nextDouble();

            while (nota1 < 0.0 || 10.0 < nota1) {

                System.out.println("nota invalida");
                nota1 = scanner.nextDouble();
            }            

            nota2 = scanner.nextDouble();

            while (nota2 < 0.0 || 10.0 < nota2) {
                System.out.println("nota invalida");
                nota2 = scanner.nextDouble();
            }                        

            System.out.printf("media = %.2f%n", (nota1 + nota2) / 2);
            
            System.out.printf("novo calculo (1-sim 2-nao)%n");                
            op = scanner.nextInt();

            while(op != 1 && op != 2){                
                System.out.printf("novo calculo (1-sim 2-nao)%n");
                op = scanner.nextInt();               
            }
        }

        scanner.close();
    }
}
