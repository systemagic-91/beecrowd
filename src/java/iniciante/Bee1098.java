package iniciante;

import java.text.DecimalFormat;

public class Bee1098 {
    public static void main(String[] args) {

        DecimalFormat dFormat = new DecimalFormat("0.0");

        double i = 0;        
        double j = 1;

        while (i <= 2) {
            
            for (int k = 0; k < 3; k++) {

                if (dFormat.format(i).endsWith("0")) System.out.println("I=" + dFormat.format(i).substring(0, 1) + " J=" + dFormat.format(j).substring(0, 1));
                else System.out.println("I=" + dFormat.format(i) + " J=" + dFormat.format(j));                
                j++;
            }

            j -= 3;
            j += 0.2;
            i += 0.2;
        }

    }
}
