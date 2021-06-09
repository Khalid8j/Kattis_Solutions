import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int W,H , ans;
        W = sc.nextInt();
        H = sc.nextInt();
        ans = (W*W) + (H*H);
        int n;

        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            if (n*n <= ans)
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
}
