import java.util.Scanner;

public class PieceOfCake {

    public static void main(String[] args)  {
        int n,v,h,diff_v, diff_h;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            h = sc.nextInt();
            v = sc.nextInt();
            diff_h = n-h;
            diff_v = n-v;

            if (diff_h > h)
                h = diff_h;
            if (diff_v > v)
                v = diff_v;

            System.out.println(v*h*4);
        }


    }
}
