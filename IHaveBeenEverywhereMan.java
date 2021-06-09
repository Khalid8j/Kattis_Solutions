import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IHaveBeenEverywhereMan {
    public static void main(String[] args)  {
        int T, x;
        String[] cities;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            x = sc.nextInt();
            cities = new String[x];
            for (int j = 0; j < x; j++) {
                cities[j] = sc.next();
            }
            LinkedHashSet <String> lhSetCities = new LinkedHashSet<String>(Arrays.asList(cities));
            //create array from the LinkedHashSet
            String[] newArray = lhSetCities.toArray(new String[lhSetCities.size()]);
            System.out.println(lhSetCities.size());
        }
    }
}

