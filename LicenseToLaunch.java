/*import java.io.File;
import java.io.FileNotFoundException;*/
import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) /*throws FileNotFoundException*/ {

        //Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest= 0;
        int junk;
        int count = 0;

        for (int i = 0; i <n ; i++) {
            if (i == 0) {
                smallest = sc.nextInt();
                if (smallest == 0) {
                    System.out.println(0);
                    return;
                }
            }
            else {
                junk = sc.nextInt();
                if (smallest > junk) {
                    smallest = junk;
                    count = i;
                }
            }
        }
        System.out.println(count);
    }
}
