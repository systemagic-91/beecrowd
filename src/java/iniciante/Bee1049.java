package iniciante;

import java.util.Scanner;

public class Bee1049 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        String p3 = scanner.nextLine();     

        scanner.close();

        if(p1.compareTo("vertebrado") == 0){

            if (p2.compareTo("ave") == 0) {
                
                if (p3.compareTo("carnivoro") == 0) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else {

                if (p3.compareTo("onivoro") == 0) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
                
            }

        } else {

            if (p2.compareTo("inseto") == 0) {
                
                if (p3.compareTo("hematofago") == 0) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else {
                
                if (p3.compareTo("hematofago") == 0) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }                                
            }
        }
    }
}
