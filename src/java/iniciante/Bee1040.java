package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);  

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double media = (n1*2 + n2*3 + n3*4 + n4*1)/10.0;

        // calculo do piso / teto
        if (media*10 - Math.floor(media*10) > 0.5001) {
            media = Math.ceil(media*10)/10;
        } else {
            media = Math.floor(media*10)/10;
        }
               

        if(5.0 <= media && media <= 6.9){

            double nota_exame = scan.nextDouble();
            
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno em exame.%n");
            System.out.printf("Nota do exame: %.1f%n", nota_exame);

            media = (media + nota_exame)/2;

            if(media >= 5.0){
                System.out.printf("Aluno aprovado.%n");
            } else {
                System.out.printf("Aluno reprovado.%n");
            }

            System.out.printf("Media final: %.1f%n", media);            

        } else if (media < 5.0){
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno reprovado.%n");
        } else {
            System.out.printf("Media: %.1f%n", media);            
            System.out.printf("Aluno aprovado.%n");
        }

        scan.close();
    }
}
