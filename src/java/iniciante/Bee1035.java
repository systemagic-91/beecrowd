package iniciante;

import java.util.Scanner;

public class Bee1035 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        scan.close();        

        if (A % 2 == 0 && B > C && 
            D > A && 
            (C + D) > (A + B) && 
            C > 0 && 
            D > 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");            
        }        
    }    
}