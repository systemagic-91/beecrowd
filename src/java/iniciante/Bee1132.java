package iniciante;

import java.util.Scanner;

public class Bee1132 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();

        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }
        
        for (int i = x; i <= y; i++) {
            if(i % 13 != 0) soma += i;
        }
        

        System.out.println(soma);
    }
}
