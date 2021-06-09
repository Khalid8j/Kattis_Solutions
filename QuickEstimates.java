
import java.util.Scanner;

public class QuickEstimates {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 0;
        while (i < N) {
            String str = sc.next();
            System.out.println(str.length());
            i++;
        }


    }
}
