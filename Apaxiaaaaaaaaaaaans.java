import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1))
                System.out.print(str.charAt(i));
        }
    }
}
