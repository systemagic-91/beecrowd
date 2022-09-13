package iniciante;

import java.util.Scanner;

public class Bee1114 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean validaSenha = false;
        String senhaCorreta = "2002";

        while (validaSenha != true){

            String tentativa = scanner.nextLine();

            if (tentativa.compareTo(senhaCorreta) == 0) {
                validaSenha = true;
            }
        }

        scanner.close();
    }
}
