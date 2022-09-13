package iniciante;

import java.util.Scanner;

public class Bee1113 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int m, n;        

        do {
            
            String [] linha = scanner.nextLine().split(" ");

            m = Integer.parseInt(linha[0]);
            n = Integer.parseInt(linha[1]);

            if(m > n){
                System.out.println("Decrescente");
            } else if (n > m) {
                System.out.println("Crescente");
            }            
            
        } while (m != n);
        
        scanner.close();
        
    }
}
