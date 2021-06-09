import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner (new File("faktor.dummy.3.in"));

        //Scanner sc = new Scanner (System.in);
        int A, I,x,result;
        A = sc.nextInt();
        I = sc.nextInt();
        x = A*I;
        result = x - (A-1);
        System.out.println(result);


    }
}
