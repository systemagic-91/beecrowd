package iniciante;

import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        scan.close();

        if ((A + B > C) && (A + C > B) && (C + B > A)){
            System.out.printf("Perimetro = %.1f%n", (A+B+C));
        } else {
            System.out.printf("Area = %.1f%n", ((A+ B)*C)/2);
        }
    }
}
