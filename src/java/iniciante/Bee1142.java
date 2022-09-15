package iniciante;

import java.util.Scanner;

public class Bee1142 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();        

        scanner.close();        

        int contador = 1;

        for (int i = 1 ; i <= n; i++) {

            for (int j = 0; j < 4; j++) {
                if (contador % 4 == 0) System.out.println("PUM");
                else System.out.print(contador + " ");
                contador++;
            }
        }
    }
}
