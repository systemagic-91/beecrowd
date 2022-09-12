package iniciante;

import java.util.Scanner;

/**
 * Bee1061
 */
public class Bee1061 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String diaInicio , diaFim; 
        String [] horaInicio;
        String [] horaFim;

        diaInicio = scanner.nextLine().replace("Dia ", "");
        horaInicio = scanner.nextLine().replace(" ", "").split(":");
        diaFim = scanner.nextLine().replace("Dia ", "");
        horaFim = scanner.nextLine().replace(" ", "").split(":");
        
        scanner.close();
        
        int dias = Integer.parseInt(diaInicio);
        int horas = Integer.parseInt(horaInicio[0]);
        int minutos = Integer.parseInt(horaInicio[1]);
        int segundos = Integer.parseInt(horaInicio[2]);

        int dias2 = Integer.parseInt(diaFim);
        int horas2 = Integer.parseInt(horaFim[0]);
        int minutos2 = Integer.parseInt(horaFim[1]);
        int segundos2 = Integer.parseInt(horaFim[2]);        

        segundos = segundos2 - segundos;
        minutos = minutos2 - minutos;
        horas = horas2 - horas;
        dias = dias2 - dias;

        if (segundos < 0) {
            segundos += 60;
            minutos--;
        }

        if(minutos < 0){
            minutos += 60;
            horas--;
        }

        if(horas < 0){
            horas += 24;
            dias--;
        }

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");        
    }
}