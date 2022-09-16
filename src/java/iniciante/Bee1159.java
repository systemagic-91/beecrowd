package iniciante;

import java.util.Scanner;

public class Bee1159 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();        

        while (x != 0){

            int soma = 0;
            int pares = 0;

            for (int i = x; pares < 5; i++) {
                
                if (i % 2 == 0){
                    pares++;
                    soma = soma + i;                    
                }
            }            
            
            System.out.println(soma);
            x = scanner.nextInt();            
        }

        scanner.close();
    }
}
