import java.util.Scanner;

public class QualityAdjustedLifeYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double q,y,mult = 1, sum = 0;
        for (int i = 0; i < N; i++) {
            q = sc.nextDouble();
            y = sc.nextDouble();
            mult = q*y;
            sum += mult;
        }

      //  System.out.println(sum);
        System.out.format("%.3f", sum); // To Round the number to 3 decimal places

    }
}
