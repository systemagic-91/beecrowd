package iniciante;

import java.util.Scanner;

public class Bee1071 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();
        
        int ini;
        int end;
        int sum=0;

        if (x > y) {
            ini = y;
            end = x;
        } else {
            ini = x;
            end = y;            
        }

        for (int i = ini+1; i < end; i++) {
            if(i % 2 != 0){                
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
