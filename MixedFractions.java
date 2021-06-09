import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner sc = new Scanner(new File("data.in"));
        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        double result;
        int intPart;
        double deciPart;
        String str;

        while (numerator != 0 && denominator != 0) {
            result = numerator * 1.0 / denominator;

            if (numerator < denominator)
                System.out.println("0 " + numerator + " / " + denominator);

            else {
                intPart = (int) result;
                deciPart = result - intPart;
                if (deciPart == 0)
                    System.out.println(intPart + " 0 / " + denominator);
                else {
                    str = convertDecimalToFraction(deciPart);
                    String str1 = "", str2 = "";
                    boolean flag = true;

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '/')
                            flag = false;

                        if (flag)
                            str1 += str.charAt(i);
                        else if (str.charAt(i) != '/')
                            str2 += str.charAt(i);
                    }

                    int num1 = Integer.parseInt(str1);
                    int num2 = Integer.parseInt(str2);
                    if (num2 < denominator) {
                        int gcd = denominator / num2;
                        System.out.println(intPart + " " + gcd * num1 + " / " + gcd * num2);
                    } else
                        System.out.println(intPart + " " + num1 + " / " + num2);
                }
            }
            numerator = sc.nextInt();
            denominator = sc.nextInt();
        }
    }

    public static String convertDecimalToFraction(double x) {
        if (x < 0) {
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1 = 1;
        double h2 = 0;
        double k1 = 0;
        double k2 = 1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1;
            h1 = a * h1 + h2;
            h2 = aux;
            aux = k1;
            k1 = a * k1 + k2;
            k2 = aux;
            b = 1 / (b - a);
        } while (Math.abs(x - h1 / k1) > x * tolerance);


        return (int) h1 + "/" + (int) k1;
    }
}
