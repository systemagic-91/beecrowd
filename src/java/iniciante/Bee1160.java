package iniciante;

import java.util.Scanner;

public class Bee1160 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int popA, popB;
        double crA, crB;

        int casosT = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < casosT; i++) {
            
            popA = scanner.nextInt();    
            popB = scanner.nextInt();
            crA = scanner.nextDouble();
            crB = scanner.nextDouble();
            
            int anos = 0;

            while (popA <= popB && anos < 101) {
                popA += (popA * crA)/100;
                popB += (popB * crB)/100;
                anos++;
            }

            if (anos > 100) System.out.println("Mais de 1 seculo.");
            else System.out.println(anos + " anos.");

        }       
        
        scanner.close();
    }
}
