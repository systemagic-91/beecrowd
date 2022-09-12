package iniciante;

import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int dias = scan.nextInt();

        scan.close();

        int ano = (int)(dias/365);

        dias = dias % 365;

        int meses = (int)(dias/30);

        dias = dias % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}
