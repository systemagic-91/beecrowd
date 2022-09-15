package iniciante;

import java.util.Scanner;

public class Bee1150 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int z = scanner.nextInt();

        int cont = 1;

        while (z <= x)
            z = scanner.nextInt();

        for (int i = x; x < z ; i++, cont++) x += i;

        System.out.println(cont);

        scanner.close();
    }
}
