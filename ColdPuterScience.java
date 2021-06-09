import java.util.Scanner;

public class ColdPuterScience {

    public static void main(String[] args) {
        int a, counter = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            a = sc.nextInt();
            if (a < 0)
                counter++;
        }
        System.out.println(counter);
    }
}
