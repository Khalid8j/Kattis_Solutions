import java.util.*;

public class DiceCup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> appearance = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                list.add(i + j);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                if (list.get(i) != list.get(i - 1))
                    appearance.add(Collections.frequency(list, list.get(i)));
            } else
                appearance.add(Collections.frequency(list, list.get(i)));

        }
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        int max = Collections.max(appearance);
        int end = Collections.frequency(appearance, max);
        int index = appearance.indexOf(max);
        int i = index;
        int j = 0;
        while (j < end) {
            System.out.println(list.get(i));
            i++;
            j++;
        }
    }
}
