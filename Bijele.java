import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        //while (sc.hasNextInt()) {
            for (int i = 0; i <6; i++) {
                x = sc.nextInt();
                if (i < 2)
                   System.out.print(1-x+" ");
                else if (i < 5)
                    System.out.print(2-x+" ");
                else
                    System.out.print(8-x);
            }
        //}
    }
}