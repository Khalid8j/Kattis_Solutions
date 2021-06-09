import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList <Integer> classGrades = new ArrayList<>();

        for (int i = 0; i <T ; i++) {

            int N = sc.nextInt();
            int sum = 0;
            int avg = 0;
            int counter = 0;
            for (int j = 0; j <N ; j++) {
                classGrades.add(sc.nextInt());
                sum += classGrades.get(j);
                if (j == N - 1) {
                    avg = sum / classGrades.size();
                }
            }
            for (int j = 0; j < N; j++) {
                    if (classGrades.get(j) > avg)
                        counter++;
            }

            double valueRounded = (double) counter*100/N;
            System.out.printf("%.3f", valueRounded);
            System.out.print("% \n");

            sum = 0;
            avg = 0;
            counter = 0;
            classGrades.clear();
        }
    }
}
