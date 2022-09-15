package iniciante;

import java.util.Scanner;

public class Bee1146 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();   
           
        while (x != 0) {
            for (int i = 1 ; i <= x; i++) {            
                if (i != x) System.out.print(i + " ");
                else System.out.println(i);
            }            
            x = scanner.nextInt();   
        }

        scanner.close();
    }
}
