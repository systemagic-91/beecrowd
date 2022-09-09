package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);  
        Locale.setDefault(Locale.US);      

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();

        double [] precos = {0.0, 4.0, 4.5, 5.0, 2.0, 1.5};

        scan.close();

        switch (codigo) {
            case 1:                
                System.out.printf("Total: R$ %.2f%n", (precos[codigo]*quantidade));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", (precos[codigo]*quantidade));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", (precos[codigo]*quantidade));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", (precos[codigo]*quantidade));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", (precos[codigo]*quantidade));
                break;                                                        
            default:
                System.out.printf("Total: R$ %.2f%n", (precos[0]*quantidade));
                break;
        }
    }
}
