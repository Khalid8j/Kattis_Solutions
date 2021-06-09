import java.util.*;

public class FreeFood {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        int begin;
        int end;

        for (int i = 0; i < n; i++) {
            begin = sc.nextInt();
            end = sc.nextInt();
            for (int j = begin; j <=end ; j++) {
                arr.add(j);
            }
        }
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(arr);
        System.out.println(set.size());
        }

}



