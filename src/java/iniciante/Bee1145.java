package iniciante;

import java.util.Scanner;

public class Bee1145 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();   
        int y = scanner.nextInt();        

        scanner.close();                

        for (int i = 1 ; i <= y; i++) {            
            if (i % x != 0) System.out.print(i + " ");
            else System.out.println(i);
        }
    }
}
