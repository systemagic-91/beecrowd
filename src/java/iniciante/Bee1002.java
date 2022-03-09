package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1002 {

    public static final double PI = 3.14159;
    public static void main(String[] args) throws IOException{        

        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        System.out.printf("A=%5.4f\n", (Bee1002.PI * Math.pow(raio, 2)));
    }    
}
