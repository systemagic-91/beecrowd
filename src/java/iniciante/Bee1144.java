package iniciante;

import java.util.Scanner;

public class Bee1144 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();        

        scanner.close();                

        for (int i = 1 ; i <= n; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i)); 
            System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
        }            
    }
}
