import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        boolean flag_1 = true;
        boolean flag_2 = false;
        boolean flag_3 = false;

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ar = str.toCharArray();

        for (char ch : ar) {
            if (ch == 'A' && (flag_1 || flag_2)) {
                flag_1 = !flag_1;
                flag_2 = !flag_2;
            } else if (ch == 'B' && (flag_2 || flag_3)) {
                flag_2 = !flag_2;
                flag_3 = !flag_3;
            } else if (ch == 'C' && (flag_1 || flag_3)) {
                flag_1 = !flag_1;
                flag_3 = !flag_3;
            }
        }

        if (flag_1)
            System.out.println(1);
        else if (flag_2)
            System.out.println(2);
        else if (flag_3)
            System.out.println(3);


    }
}
