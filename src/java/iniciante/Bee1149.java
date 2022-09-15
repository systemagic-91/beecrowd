package iniciante;

import java.util.Scanner;

public class Bee1149 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();
        
        while(n < 0 || n == 0)
            n = scanner.nextInt();
        
        scanner.close();
        
        int soma = 0;
                 
        for (int i = 0 ; i < n; i++) {
            soma += a + i;
        }             
        
        System.out.println(soma);
    }
}
