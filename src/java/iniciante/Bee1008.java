package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int nFuncionario = scan.nextInt();
        int horasTrabalhadas = scan.nextInt();
        double valorRecebidoHora = scan.nextDouble();

        scan.close();

        System.out.println("NUMBER = "+ nFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", (horasTrabalhadas*valorRecebidoHora));    
    }        
}
