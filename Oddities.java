import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,n;
        T = sc.nextInt();
        for (int i = 0; i <T ; i++) {
            n = sc.nextInt();

            if (n % 2 == 0)
                System.out.println(n +" is even");
            else
                System.out.println(n +" is odd");


        }
    }
}
