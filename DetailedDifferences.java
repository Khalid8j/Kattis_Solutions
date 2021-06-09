
import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str1,str2;

        for (int i = 0; i <N ; i++) {
             str1 = sc.next();
             str2 = sc.next();
            System.out.println(str1);
            System.out.println(str2);
            int length = str1.length();

            for (int j = 0; j <length ; j++) {
                if (str1.charAt(j) == str2.charAt(j))
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
            System.out.println();

        }
    }
}
