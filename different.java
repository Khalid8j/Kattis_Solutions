import java.util.Scanner;

public class different {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        while (s1.hasNextLong()) {
            long x = s1.nextLong(), y = s1.nextLong();
            System.out.println(Math.abs(x - y));
        }
    }
}

