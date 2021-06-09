import java.util.ArrayList;
import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            list1.add(sc.nextInt());
        }

        for (int i = 0; i <list1.size(); i++) {
            if (list1.get(i) == -1) {
                list2.add(list1.get(i));
            }
        }
        list1.removeAll(list2);

        double sum = 0;
        for (int i = 0; i <list1.size() ; i++) {

            sum += list1.get(i);
        }

        double result = sum/list1.size();
        //System.out.println(result);
        System.out.format("%.3f",result);

    }
}
