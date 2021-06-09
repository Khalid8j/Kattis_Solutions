import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Backspace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        //int i = 1;
        long start = System.currentTimeMillis();
        do {
            list.subList(list.indexOf("<")-1, list.indexOf("<")+1).clear();
        } while (list.contains("<"));
        /*
        while(i < list.size() && list.contains("<")) {
            if (list.get(i).equals("<")) {
                list.remove(i-1);
                list.remove(i-1);
                i--;
            }
            else
                i++;
        }*/
        String s = String.join("", list);
        System.out.println(s);
       long end = System.currentTimeMillis();

        System.out.println(end - start);


    }


}
