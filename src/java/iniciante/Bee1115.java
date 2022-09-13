package iniciante;

import java.util.Scanner;

public class Bee1115 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean coordenadaNula = false;       

        while (coordenadaNula != true){

            String [] coordenadas = scanner.nextLine().split(" ");
            
            int x = Integer.parseInt(coordenadas[0]);
            int y = Integer.parseInt(coordenadas[1]);


            if (x == 0 || y == 0) {
                coordenadaNula = true;
            } else if (x > 0 && y > 0){
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
        }

        scanner.close();        
    }
}
