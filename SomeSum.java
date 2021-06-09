//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class SomeSum {
    public static void main(String[] args)/* throws FileNotFoundException */{

       // Scanner sc = new Scanner(new File("2.in"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1 || N == 3 || N == 5 || N == 7 ||N == 9 )
            System.out.println("Either");
        else if (N == 4 || N == 8)
            System.out.println("Even");
        else if (N == 2 || N == 6 || N == 10)
            System.out.println("Odd");
    }
}
