import java.util.Scanner;

public class TakeTwoStones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 != 0)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }


    }
}
