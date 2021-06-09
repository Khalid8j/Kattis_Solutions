import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StackingCups {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("1.in"));

        int N = sc.nextInt();
        String str1, str2;
        int R, D;
        ArrayList list = new ArrayList();
        ArrayList radiusList = new ArrayList();

        for (int i = 0; i < N; i++) {
            str1 = sc.next();
            str2 = sc.next();


            if (isNumber(str1)) {
                D = Integer.parseInt(str1);

                R = D / 2;
                str1 = str2;
                radiusList.add(R);
            } else {
                R = Integer.parseInt(str2);
                radiusList.add(R);
            }


            list.add(str1);
            list.add(R);
            // System.out.println(str1 + " " + R);
        }
        Collections.sort(radiusList);
        ArrayList sortedList = new ArrayList();

        for (int i = 0; i < radiusList.size(); i++) {
            for (int j = 1; j < list.size(); j = j + 2) {
                if ((int) list.get(j) == (int) radiusList.get(i)) {
                    sortedList.add(list.get(j - 1));
                    break;
                }

            }
        }

       for (Object s: sortedList) {
           System.out.println(s);
       }

    }

    public static boolean isNumber(String s) {

        if (Character.isDigit(s.charAt(0)))
            return true;
        else
            return false;
    }
}
