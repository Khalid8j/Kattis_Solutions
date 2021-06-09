import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumSquaredDigitsFunction {

    // To return char for a value. For
// example '2' is returned for 2.
// 'A' is returned for 10. 'B' for 11
    static char reVal(int num) {
        if (num >= 0 && num <= 9)
            return (char) (num + 48);
        else
            return (char) (num - 10 + 65);
    }

    // Function to convert a given decimal number
// to a base 'base' and
    static String fromDeci(int base1, int inputNum) {
        String s = "";

        // Convert input number is given
        // base by repeatedly dividing it
        // by base and taking remainder
        while (inputNum > 0) {
            s += reVal(inputNum % base1);
            inputNum /= base1;
        }
        StringBuilder ix = new StringBuilder();

        // append a string into StringBuilder input1
        ix.append(s);

        // Reverse the result
        return new String(ix.reverse());
    }

    public static int SSD(String number) {

        char[] digits = number.toCharArray();

        int result = 0;
        int x = 0;

        for (int i = 0; i < digits.length; i++) {


            if (digits[i] == 'A')
                x = 10;
            else if (digits[i] == 'B')
                x = 11;
            else if (digits[i] == 'C')
                x = 12;
            else if (digits[i] == 'D')
                x = 13;
            else if (digits[i] == 'E')
                x = 14;
            else if (digits[i] == 'F')
                x = 15;
            else
                x = Character.getNumericValue(digits[i]);


            result += Math.pow(x, 2);

        }
        return result;
    }



    public static void main(String[] args) throws FileNotFoundException {

        //Scanner sc = new Scanner(new File("sample01.in"));
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i <P; i++) {
            if (b == 10) {
                result = SSD(String.valueOf(n));
                System.out.print(K+" ");
                System.out.println(result);
            }
            else {
                System.out.print(K + " ");
                result = SSD(fromDeci(b,n));
                System.out.println(result);
            }
            if (K < P) {
                K = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();
            }
        }
    }
}
