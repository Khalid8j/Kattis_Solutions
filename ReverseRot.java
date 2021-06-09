import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseRot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        int index = 0;
        char[] new_word;
        int n = sc.nextInt();

        while (n != 0) {
            String word = sc.next();
            new_word = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                index = list.indexOf(String.valueOf(word.charAt(i)));
                new_word[i] = str.charAt((index + n) % 28);
            }
            for (int i = new_word.length - 1; i >= 0; i--) {
                System.out.print(new_word[i]);
            }
            System.out.println();
            n = sc.nextInt();

        }
    }
}
