package iniciante;

import java.util.Scanner;

public class Bee1134 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int op;
        int alcool = 0;
        int gasolina = 0; 
        int diesel = 0;

        do{
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;            
                case 3:   
                    diesel++;
                    break;
            }

        } while(op != 4);

        scanner.close();

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);        
    }
}
