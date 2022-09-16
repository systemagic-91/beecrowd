package iniciante;

import java.util.Scanner;

/**
 * Bee1158
 */
public class Bee1158 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] caso;

        for (int i = 0; i < n; i++) {
            caso = scanner.nextLine().split(" ");
            int x = Integer.parseInt(caso[0]);
            int y = Integer.parseInt(caso[1]);
            int soma = 0;

            while (y > 0){
                if (x % 2 != 0) {
                    soma += x;
                    y--;
                }
                x++;
            }
            
            System.out.println(soma);
        }
        
        scanner.close();
    }
}