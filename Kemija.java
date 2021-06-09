import java.util.*;

public class Kemija {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <Character> vowelLetters = new ArrayList<Character>(
                Arrays.asList('a','e','i','o','u'));

        String str = sc.nextLine();
        char [] array = str.toCharArray();

        int i = 0;
        while (i < str.length()) {
            if (vowelLetters.contains(str.charAt(i))) {
                array[i+1] = '0';
                array[i+2] = '0';
                i+=3;
            }
            else {
                i++;
            }
        }
        String output = new String(array);
        System.out.println(output.replaceAll("0",""));


    }
}
