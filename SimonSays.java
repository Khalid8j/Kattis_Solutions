//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {

//      Scanner sc = new Scanner(new File("02_simple.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        for (int i = 0; i <=n ; i++) {
            str = sc.nextLine();
            if (str.indexOf("Simon") == 0 && str.indexOf("says") == 6 )
              System.out.println(str.substring(10));
        }
    }
}


