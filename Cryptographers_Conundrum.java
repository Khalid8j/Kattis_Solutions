import java.util.Scanner;

public class Cryptographers_Conundrum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] str_char = new char[str.length()];
        char[] name = {'P', 'E', 'R'};
        int numOfDays = 0;

        for (int i = 0; i < str.length(); i++) {
            str_char[i] = str.charAt(i);
        }

        for (int i = 0; i < str_char.length; i = i + 3) {
            if (str_char[i] != name[0])
                numOfDays++;
        }
        for (int i = 1; i < str_char.length; i = i + 3) {
            if (str_char[i] != name[1])
                numOfDays++;
        }
        for (int i = 2; i < str_char.length; i = i + 3) {
            if (str_char[i] != name[2])
                numOfDays++;
        }
        System.out.println(numOfDays);
    }
}

