package iniciante;

import java.util.Scanner;

public class Bee1046 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        scanner.close();

        if(horaInicio > horaFinal){
            System.out.printf("O JOGO DUROU %d HORA(S)%n", ((24 - horaInicio) + horaFinal));
        }

        if(horaInicio == horaFinal){
            System.out.printf("O JOGO DUROU 24 HORA(S)%n");
        }

        if(horaInicio < horaFinal){
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (horaFinal - horaInicio));
        }        
    }
}
