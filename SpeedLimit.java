//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(new File("sample.in"));
        Scanner sc = new Scanner(System.in);

        int[] speed;
        int[] time;
        int result = 0;
       int n = sc.nextInt();

        while (n != -1) {
            speed = new int[n];
            time = new int[n];
            for (int i = 0; i < n; i++) {
                speed[i] = sc.nextInt();
                time[i] = sc.nextInt();
                if (i == 0)
                    result = speed[i] * time [i];
                else
                    result += speed[i] * (time [i] - time [i-1]);
            }
            System.out.println(result+" miles");
            n = sc.nextInt();
        }
    }
}
