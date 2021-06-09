import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("2.in"));
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a+b == c || a*b == c ||
                a-b == c || b-a == c ||
                a/b == c || b/a == c) {
                System.out.println("Possible");
                //break;
            }
            else {
                System.out.println("Impossible");
                //break;
            }







        }


    }
}
