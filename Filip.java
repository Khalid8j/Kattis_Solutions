
import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Convert a and b to string
        a = substitute(Integer.toString(a));
        b = substitute(Integer.toString(b));
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int substitute(String a) {
        char c1,c2;
        c1 = a.charAt(0);
        c2 = a.charAt(a.length()-1);
        String str = ""+c2+a.charAt(1)+c1; // replace the first char with the last
        return Integer.parseInt(str); //return the value as int
    }
}
