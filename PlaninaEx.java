import java.util.Scanner;

public class PlaninaEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        int side = 2;
        while (iterations-- > 0)
            side += side - 1;
        System.out.println((int) Math.pow(side, 2));
    }
}
