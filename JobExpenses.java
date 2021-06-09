import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int incomes = 0, expenses = 0;

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp < 0)
                expenses += temp;

        }
        System.out.println(expenses * -1);
    }

}
