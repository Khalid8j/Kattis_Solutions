import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double length = str.length();

        ArrayList lowercase_List = new ArrayList();
        ArrayList uppercase_List = new ArrayList();

        double lowercase_Counter = 0;
        double uppercase_Counter = 0;
        double symbols_Counter = 0;
        double whitespace_Counter = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            lowercase_List.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            uppercase_List.add(i);
        }

        for (int i = 0; i < length; i++) {
            if (lowercase_List.contains(str.charAt(i)))
                lowercase_Counter++;
            else if (uppercase_List.contains(str.charAt(i)))
                uppercase_Counter++;
            else if (str.charAt(i) == '_')
                whitespace_Counter++;
            else
                symbols_Counter++;
        }

        System.out.print(String.format("%.15g%n", whitespace_Counter/length));
        System.out.print(String.format("%.15g%n", lowercase_Counter/length));
        System.out.print( String.format("%.15g%n",uppercase_Counter/length));
        System.out.print(String.format("%.15g%n",symbols_Counter /length));




    }
}
