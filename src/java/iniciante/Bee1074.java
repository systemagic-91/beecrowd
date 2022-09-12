package iniciante;

import java.util.Scanner;

public class Bee1074 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int valor = scanner.nextInt();

            if(valor == 0) System.out.println("NULL");
            if(valor % 2 == 0 && valor > 0) System.out.println("EVEN POSITIVE");
            if(valor % 2 == 0 && valor < 0) System.out.println("EVEN NEGATIVE");
            if(valor % 2 != 0 && valor > 0) System.out.println("ODD POSITIVE");
            if(valor % 2 != 0 && valor < 0) System.out.println("ODD NEGATIVE");
        }
        
        scanner.close();
    }
}
