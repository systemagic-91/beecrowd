package iniciante;

import java.util.Scanner;

public class Bee1007 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A, B, C, D;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        scan.close();

        System.out.println("DIFERENCA = " + (A*B-C*D));
    }
}
