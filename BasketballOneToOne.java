//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasketballOneToOne {

    public static void main(String[] args) /*throws FileNotFoundException*/ {

        //Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int score_A = 0;
        int score_B = 0;

        for (int i = 0; i < arr.length; i += 2) {

            if (arr[i] == 'A') {
                score_A += Character.getNumericValue(arr[i + 1]);
                //System.out.println("A is "+score_A);
                if (score_A >= 11) {
                    System.out.println('A');
                    return;
                }
            } else if (arr[i] == 'B') {
                score_B += Character.getNumericValue(arr[i + 1]);
               // System.out.println("B is "+score_B);
                if (score_B >= 11) {
                    System.out.println('B');
                    return;
                }
            }

            if (score_A == 10 && score_B == 10) {
                i+=2;
                while (i < arr.length) {
                    if (arr[i] == 'A') {
                        score_A += Character.getNumericValue(arr[i + 1]);
                       // System.out.println("A is " + score_A);
                    }
                    else if (arr[i] == 'B') {
                        score_B += Character.getNumericValue(arr[i + 1]);
                       // System.out.println("B is "+score_B);
                    }

                    if (score_A >= score_B + 2) {
                        System.out.println('A');
                        return;
                    } else if (score_B >= score_A + 2) {
                        System.out.println('B');
                        return;
                    }
                    i+=2;
                }
            }
        }
    }
}
