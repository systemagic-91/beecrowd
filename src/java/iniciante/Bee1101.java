package iniciante;

import java.util.Scanner;

public class Bee1101 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int m, n;
        boolean end = true;

        do {
            
            String [] linha = scanner.nextLine().split(" ");

            m = Integer.parseInt(linha[0]);
            n = Integer.parseInt(linha[1]);

            if ((m > 0) && (n > 0)) {

                if(m > n){
                    int aux = n;
                    n = m;
                    m = aux;
                }

                int soma = 0;

                for (int i = m; i <= n; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }

                System.out.println("Sum=" + soma);
            } else {
                end = false;
            }
            
        } while (end);

        scanner.close();
    }
}
