import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b;
        double p;
        double BPM,max_BPM,min_BPM,diff;

        for (int i = 0; i <N ; i++) {
            b = sc.nextInt();
            p = sc.nextDouble();
            BPM = (60*b) / p;
            diff = 60/p;
            max_BPM = BPM + diff;
            min_BPM = BPM - diff;
            System.out.format("%.4f",min_BPM);
            System.out.print(" ");
            System.out.format("%.4f", BPM);
            System.out.print(" ");
            System.out.format("%.4f",max_BPM);
            System.out.println();
        }
    }
}
