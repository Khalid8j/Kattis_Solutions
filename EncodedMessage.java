import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int counter = 0;
        while (counter < t) {
            String str = sc.next();
            int length = str.length();
            int lettersCounter = 0;
            int arrLength = (int) Math.sqrt(length);
            char[][] arr = new char[arrLength][arrLength];

            while (lettersCounter < length) {
                for (int i = 0; i < arrLength; i++) {
                    for (int j = 0; j < arrLength; j++) {
                        arr[i][j] = str.charAt(lettersCounter);
                        lettersCounter++;
                    }
                }
            }
           /* for (int i = 0; i < arrLength; i++) {
                for (int j = 0; j < arrLength; j++) {
                    System.out.print(arr[i][j]);
                }
            }*/

            for (int i = arrLength-1; i >=0 ; i--) {
                for (int j = 0; j <arrLength; j++) {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println();
            counter++;
        }
    }
}
