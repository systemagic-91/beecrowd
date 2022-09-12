package iniciante;

import java.util.Scanner;

public class Bee1048 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double ganho = salario;

        int percentual;

        scanner.close();

        if(salario > 2000.00){
            salario += salario * 0.04;
            percentual = 4;
        } else if (salario > 1200.00){
            salario += salario * 0.07;
            percentual = 7;
        } else if (salario > 800.00){
            salario += salario * 0.10;
            percentual = 10;
        } else if (salario > 400.00){
            salario += salario * 0.12;
            percentual = 12;
        } else {
            salario += salario * 0.15;
            percentual = 15;
        }

        ganho = salario - ganho;

        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", ganho);
        System.out.println("Em percentual: " + percentual + " %");
    }
}
