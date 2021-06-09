import java.util.Scanner;

public class Zamka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        int smallest = 0;
        int biggest = 0;

        for (int i = l; i <=d; i++) {

            if (sumDigits(i) == x && smallest == 0)
                smallest = i;

            if (sumDigits(i) == x)
                biggest = i;
        }

        System.out.println(smallest);
        System.out.println(biggest);

    }

    public static int sumDigits(int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
