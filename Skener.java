import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Skener {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("1.in"));

        int R,C,ZR,ZC;
        R = sc.nextInt();
        C = sc.nextInt();
        ZR = sc.nextInt();
        ZC = sc.nextInt();
        String str = "";
        for (int i = 0; i <R; i++) {
            str += sc.next();
        }
        char [] arr = str.toCharArray();
        char [] [] arr2D = new char[R][C];

        int counter = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr2D[i][j] = arr[counter];
                counter++;
            }
        }

        for (int i = 0; i <R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr2D[i][j]);

            }

        }

    }
}
