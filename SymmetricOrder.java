//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class SymmetricOrder {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(new File("sample.in"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[];
        int set = 1;
        while (n != 0) {
            System.out.println("SET " + set);
            arr = new String[n];
            int end = n - 1;
            if (n % 2 == 0) { // If number of elements is even
                for (int i = 0; i < n / 2; i++) {
                    arr[i] = sc.next();
                    arr[end] = sc.next();
                    end--;
                }
            } else { // If number of elements is odd
                for (int i = 0; i <= n / 2; i++) {
                    if (i != end) {
                        arr[i] = sc.next();
                        arr[end] = sc.next();
                    } else
                        arr[i] = sc.next();
                    end--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
            n = sc.nextInt();
            set++;
        }
    }
}
