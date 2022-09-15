package iniciante;

import java.util.Scanner;

public class Bee1131 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);                
        
        int gremio = 0, inter = 0;
        int quantGrenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        
        int op = 1;

        while (op == 1) {            

            String [] linha = scanner.nextLine().split(" ");
            
            inter = Integer.parseInt(linha[0]);
            gremio = Integer.parseInt(linha[1]);

            quantGrenais++;

            if (inter > gremio) {
                vitoriasInter++;
            } else if (inter < gremio){
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.printf("Novo grenal (1-sim 2-nao)%n");
            op = Integer.parseInt(scanner.nextLine());

            while(op != 1 && op != 2){                
                System.out.printf("Novo grenal (1-sim 2-nao)%n");
                op = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println(quantGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (inter > gremio) System.out.println("Inter venceu mais");
        if (inter < gremio) System.out.println("Gremio venceu mais");

        scanner.close();        
    }
}
