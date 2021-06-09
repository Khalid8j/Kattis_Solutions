import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.length() == 1) {
            System.out.println("no hiss");
            return;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 's') {
                if (str.charAt(i) == str.charAt(i+1)) {
                    System.out.println("hiss");
                    return;
                }
            }
            if (i == str.length()-2)
                System.out.println("no hiss");
        }
    }
}
