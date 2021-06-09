import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {

        int T,n, new_n;
        Scanner sc = new Scanner(System.in);
        String str;
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            new_n = fact(n);
           str = Integer.toString(new_n);
            str = str.substring(str.length()-1, str.length());
            System.out.println(str);
        }
    }

    public static int fact(int a) {
        if(a>0)
            return a * fact(a-1);

        return 1;
    }
}

