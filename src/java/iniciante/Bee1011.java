package iniciante;

import java.util.Scanner;

public class Bee1011 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();        
        scan.close();

        double PI = 3.14159;

        System.out.printf("VOLUME = %.3f", ((4/3.0)*PI*Math.pow(raio, 3)));

    }
}
