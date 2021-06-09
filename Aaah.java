
import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String j = sc.next();
        String d = sc.next();
        int count_j = 0;
        int count_d = 0;

        while (j.charAt(count_j) == 'a')
            count_j++;

        while (d.charAt(count_d) == 'a')
            count_d++;

        if (count_d > count_j)
            System.out.println("no");
        else
            System.out.println("go");
    }
}
