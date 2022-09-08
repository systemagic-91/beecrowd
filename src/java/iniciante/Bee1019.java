package iniciante;

import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int segundos = scan.nextInt();
                
        int minutos = (int)(segundos / 60);

        segundos = segundos % 60;

        int horas = (int)(minutos/60);

        minutos = minutos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        scan.close();
    }
}
