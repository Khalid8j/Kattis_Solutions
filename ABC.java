//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {

        int [] ar = new int [3];
        //  Scanner sc = new Scanner(new File("2.in"));
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j <3; j++) {
            ar[j] = sc.nextInt();
        }

        Bubble(ar);
        int A = ar[0];
        int B = ar[1];
        int C = ar[2];

        String str = sc.next();

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) == 'A') {
                System.out.print(A);
                if (i != str.length()-1)
                    System.out.print(" ");
            }
            else if (str.charAt(i) == 'B') {
                System.out.print(B);
                if (i != str.length()-1)
                    System.out.print(" ");
            }
            else if (str.charAt(i) == 'C') {
                System.out.print(C);
                if (i != str.length()-1)
                    System.out.print(" ");
            }
        }
    }

    public static void Bubble(int[] a) {
        int length = a.length;
        int temp = 0;
        int i = 0, j = 0;

        for (i = 0; i < length; i++) {

            for (j = 1; j < (length - i); j++) {

                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
