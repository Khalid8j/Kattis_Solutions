//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) /*throws FileNotFoundException */{

       // Scanner sc = new Scanner(new File("2.in"));
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double l = sc.nextDouble();
        double len,w, result = 0;

        for (int i = 0; i < l; i++) {
            w = sc.nextDouble();
            len = sc.nextDouble();
            result += w*len*c;
        }
       // System.out.println(result);
        System.out.format("%.6f", result);

    }
}
