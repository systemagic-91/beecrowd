package iniciante;

import java.util.Scanner;

public class Bee1070 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        scanner.close();

        int i = 0; 

        while (i != 6) {
            if(valor % 2 != 0) {
                System.out.println(valor);
                i++;
            }
            valor++;
        }        
    }
}
