import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        if (m >= n) {
             result = m - n;
            if (result != 1)
                System.out.println("Dr. Chaz will have "+result+" pieces of chicken left over!");
            else
                System.out.println("Dr. Chaz will have "+result+" piece of chicken left over!");
        }
        else {
            result = n - m;
            if (result != 1)
            System.out.println("Dr. Chaz needs "+result+" more pieces of chicken!");
            else
                System.out.println("Dr. Chaz needs "+result+" more piece of chicken!");
        }


    }
}
