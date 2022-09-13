package iniciante;

import java.util.Scanner;

public class Bee1099 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int casos = Integer.parseInt(scanner.nextLine());        
        int somaImpares;

        for (int i = 0; i < casos; i++) {

            somaImpares = 0;
           
            String [] valores = scanner.nextLine().trim().split(" ");
            
            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);

            if (x > y) {
                int aux = y;
                y = x;
                x = aux;
            }

            for (int j = (x+1); j < y; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }        
            }

            System.out.println(somaImpares);
        }        

        scanner.close();
    }
}
