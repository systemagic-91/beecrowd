package iniciante;

import java.util.Scanner;

public class Bee1052 {
    public static void main(String[] args) {
        
        String [] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);

        System.out.println(meses[scanner.nextInt()-1]);

        scanner.close();
    }
}
