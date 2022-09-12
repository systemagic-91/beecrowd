package iniciante;

import java.util.Scanner;

public class Bee1013 {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int A, B, C;
        int maiorAB;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        
        scan.close();

        maiorAB = (A+B+Math.abs(A-B))/2;
        maiorAB = C > maiorAB ? C:maiorAB;

        System.out.println(maiorAB + " eh o maior");
    }    
}
