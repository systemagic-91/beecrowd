package iniciante;

import java.util.Scanner;

public class Bee1047 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int hInicio = scanner.nextInt();
        int mInicio = scanner.nextInt();
        int hFinal = scanner.nextInt();
        int mFinal = scanner.nextInt();

        scanner.close();

        // conversão de horas para minutos
        int hm1 = (hInicio * 60) + mInicio;
        int hm2 = (hFinal * 60) + mFinal;
        int h24 = 24 * 60;

        int minutos = 0;

        if (hm2 > hm1){
            minutos = hm2 - hm1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (minutos/60), (minutos%60));
        } else if (hm1 > hm2){
            minutos = (h24 - hm1) + hm2;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (minutos/60), (minutos%60));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", 24, 0);
        }

    }
}

