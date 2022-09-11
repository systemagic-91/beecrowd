package iniciante;

import java.util.Scanner;

public class Bee1051 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;

        scanner.close();

        if (salario > 4500.00) {

            imposto = (salario - 4500) * 0.28;
            imposto += 1500 * 0.18;
            imposto += 1000 * 0.08; 

            System.out.printf("R$ %.2f%n", imposto);
            
        } else if (salario > 3000.00) {

            imposto = (salario - 3000) * 0.18;
            imposto += 1000 * 0.08;
            
            System.out.printf("R$ %.2f%n", imposto);
            
        } else if (salario > 2000.00) {            

            imposto = (salario - 2000) * 0.08;           
            
            System.out.printf("R$ %.2f%n", imposto);

        } else {
            System.out.println("Isento");
        }        
    }
}
