package iniciante;

public class Bee1097 {
    public static void main(String[] args) {
        
        int j = 7;
        for (int i = 1; i <= 9; i = i + 2) {   
            for (int k = 0; k < 3; j--, k++) {
                System.out.println("I=" + i + " J=" + j);
            }
            j = j + 5;
        }
    }
}
