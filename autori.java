import java.util.Scanner;

public class autori {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        String [] parts;
        while (sc.hasNextLine()) {
            s = sc.nextLine(); // s value will be the full name in the input sample
            parts = s.split("-"); // this will split string s and store its parts in array parts
            for (String str: parts) {// str in each loop will get the next value of the array
                System.out.print(str.charAt(0)); // first character of str is printed
            }
        }
    }
}
