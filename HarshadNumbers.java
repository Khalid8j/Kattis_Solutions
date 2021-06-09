import java.util.Scanner;

public class HarshadNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
    //  boolean found = false;

        while (true) {

            String str = String.valueOf(x);
            char [] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                y += Character.getNumericValue(ch[i]);
            }
            if (x % y == 0)
                break;
                //found = true;
            else {
                x++;
                y = 0;
            }


        }

        System.out.println(x);


    }
}
