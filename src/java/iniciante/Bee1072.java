package iniciante;

import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();        
        int valoresIn = 0;
        int valoresOut = 0;
        
        for (int i = 0; i < n; i++) {
            
            int valor = scanner.nextInt();
            
            if (10 <= valor && valor <= 20) valoresIn++;
            else valoresOut++;
        }
        
        scanner.close();
        
        System.out.println(valoresIn + " in");        
        System.out.println(valoresOut + " out");
    }
}
