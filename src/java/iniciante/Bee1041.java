package iniciante;

import java.util.Scanner;

/**
 * Bee1041
 */
public class Bee1041 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        scan.close();        

        if(x > 0 && y > 0){
            System.out.println("Q1");
        } 

        if (x < 0 && y > 0){
            System.out.println("Q2");
        }

        if (x < 0 && y < 0){
            System.out.println("Q3");
        }        

        if (x > 0 && y < 0){
            System.out.println("Q4");
        }

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }

        if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }        

        if (x != 0 && y == 0){
            System.out.println("Eixo X");
        }                
    }
}