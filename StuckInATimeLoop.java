import java.util.Scanner;

public class StuckInATimeLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <=n; i++) {
                System.out.println(i + " Abracadabra");

            }
        }
    }
}
