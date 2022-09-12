package iniciante;

import java.util.Scanner;

public class Bee1012 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double A, B, C;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        scan.close();

        double PI = 3.14159;

        System.out.printf("TRIANGULO: %.3f%n", (A*C)/2);
        System.out.printf("CIRCULO: %.3f%n", (PI*(Math.pow(C, 2))));
        System.out.printf("TRAPEZIO: %.3f%n", (((A+B)*C)/2));
        System.out.printf("QUADRADO: %.3f%n", (B*B));
        System.out.printf("RETANGULO: %.3f%n", (A*B));
    }
}
