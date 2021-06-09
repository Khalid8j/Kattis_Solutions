import java.util.Scanner;

public class Quadrant_Selection {

    public static void main(String[] args) {
        int x;
        int y ;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > 0 && y > 0 )
                System.out.println(1);
            if (x<0 && y>0)
                System.out.println(2);
            else if (x<0 && y<0)
                System.out.println(3);
            else if (x>0 && y<0)
                System.out.println(4);
        }







    }
}
