import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();

        double a = h/(Math.sin(Math.toRadians(v)));

        System.out.println((int) Math.ceil(a));






    }
}
