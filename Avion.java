import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        int index = 0;

        while (list.contains("<")) {
            index = list.indexOf("<");
            list.remove(index--);
            list.remove(index--);
        }
        String s = String.join("", list);
        System.out.println(s);
        /*
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (sc.nextLine().contains("FBI")) {
                System.out.println(i + 1);
                found = true;
            }
        }

        if (!found)
            System.out.println("HE GOT AWAY!");

*/





    }
}
