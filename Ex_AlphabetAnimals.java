import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_AlphabetAnimals {

    static int intersect(String[] wtab, String cw) {

        int i = -1, j = 0; j= wtab.length-1;
        while (j >= 0) {
            if ((wtab[j].charAt(0) == cw.charAt(cw.length()-1))
                    && (wtab[j].equals(cw) == false)) {
                i = j ; break;
            }
            j--;
        }

        return i;
    }

    public static void main(String[] args) {
        String cw;
        String wtab[];
        int index = -1, n;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        cw = sc.next();
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("?");
            return;
        }
        wtab = new String[n];
        for (int i = 0; i < wtab.length; i++) {
            wtab[i] = sc.next();
        }
        for (int i = 0; i < wtab.length; i++) {
            index = intersect(wtab, cw);
            if (index == -1)
            {
                if (found == false)
                {
                    System.out.println("?");
                    return;
                }
                else
                {
                    System.out.println(cw + "!");
                    return;
                }
            }
            else
            {
                if (found == false) {
                cw = wtab[index];
                found = true; }
                else {

                    System.out.println(cw);
                    return;
                }


            }
        }


    }

}