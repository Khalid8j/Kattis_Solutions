import java.io.*;
import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = sc.readLine();
        dc.write(s.equals("OCT 31") || s.equals("DEC 25") ? "yup" : "nope");

        dc.close();
        sc.close();
*/
       /* String str1 = "OCT 31";
        String str2 = "DEC 25";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals(str1) || s.equals(str2))
            System.out.println("yup");
        else
            System.out.println("nope");*/

        int i = 0;
        int ii = i+97;
        char c = (char) ii;
        System.out.println(c);
    }
}
