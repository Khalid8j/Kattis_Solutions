import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        int x; int power, number;
        String str = "";
        char p = ' ';

        for (int i = 1; i <=N ; i++) {
            x = sc.nextInt();
            str = Integer.toString(x); // Converting x to a string to deal with it
            p = str.charAt(str.length() -1); // p will be the last digit
            str = str.substring(0, str.length() -1); // removing the last digit from the number
            number = Integer.parseInt(str); // returning the string to number
            power = Character.getNumericValue(p); // returning char to int
            sum+= Math.pow(number,power); // Calculating
        }
        System.out.println(sum);
    }
}
