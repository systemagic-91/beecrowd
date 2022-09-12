package iniciante;

import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();    

        scan.close();

        if(A > B && (A % B == 0)){
            System.out.println("Sao Multiplos");
        } else if (B > A && (B % A == 0)){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
