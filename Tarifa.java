import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int T = sc.nextInt();
        int p, new_x = 0;

        for (int n = 1; n <= T ; n++) {
            p = sc.nextInt();
            new_x = x-p+new_x;
        }
        new_x = x+new_x;
        System.out.print(new_x);

    }
}
