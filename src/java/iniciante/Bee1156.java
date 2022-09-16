package iniciante;

public class Bee1156 {
    public static void main(String[] args) {
        double s = 0.0;

        for (double i = 1, j=1; i <= 39; i=i+2, j+=j) 
            s += i/j;    
        
        System.out.printf("%.2f\n", s);        
    }
}
