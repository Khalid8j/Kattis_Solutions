import java.util.Scanner;

public class TheEasiestProblemIsThisOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int i = 11;
            while (N != 0) {
                int N_digits = getSum(N);
                int res_digits = getSum(N * i);
                if (N_digits == res_digits) {
                    System.out.println(i);
                    break;
                } else
                    i++;
            }
        }
    }

    static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }
}
