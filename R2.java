import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        int r1,s;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            r1 = sc.nextInt();
            s = sc.nextInt();
            s = s*2;
            System.out.println(s-r1);

        }
    }
}
