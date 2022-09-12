package iniciante;

import java.util.Scanner;

public class Bee1042 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();

        scan.close();

        if(valor2 < valor1 && valor1 < valor3){
            
            System.out.println(valor2); 
            System.out.println(valor1);
            System.out.println(valor3);

        } else if (valor1 < valor2 && valor2 < valor3) {

            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);

        } else if (valor1 < valor3 && valor3 < valor2) {

            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);

        } else if (valor3 < valor1 && valor1 < valor2) {

            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);

        } else if (valor3 < valor2 && valor2 < valor1) {

            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
        
        } else if (valor2 < valor3 && valor3 < valor1) {         
            
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
        }

        System.out.println("");

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);        
    }
}
