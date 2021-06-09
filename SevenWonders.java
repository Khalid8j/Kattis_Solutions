import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenWonders {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] ar = str.split("");
        List <String> letters = Arrays.asList(ar);

        // Counting how many times the three letters repeated in the list
        int t = Collections.frequency(letters,"T");
        int c = Collections.frequency(letters,"C");
        int g = Collections.frequency(letters,"G");

        int min = Math.min(Math.min(t,c),g);

        System.out.println(t*t+c*c+g*g+min*7);
    }


}
