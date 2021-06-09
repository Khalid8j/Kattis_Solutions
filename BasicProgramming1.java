import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasicProgramming1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;
        int evenSum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        if (t == 1)
            System.out.println(7);

        else if (t == 2) {
            if (A[0] > A[1])
                System.out.println("Bigger");
            else if (A[0] == A[1])
                System.out.println("Equal");
            else
                System.out.println("Smaller");
        } else if (t == 3) {

            Arrays.sort(A, 0, 3);
            System.out.println(A[1]);
        } else if (t == 4) {

            for (int i = 0; i < N; i++) {
                sum += A[i];
            }
            System.out.println(sum);
        } else if (t == 5) {

            for (int i = 0; i < N; i++) {
                if (A[i] % 2 == 0)
                    evenSum += A[i];
            }
            System.out.println(evenSum);

        } else if (t == 6) {

            char c = ' ';
            int temp;
            for (int i = 0; i < N; i++) {
                temp = (A[i] % 26) + 97;
                c = (char) temp;
                System.out.print(c);
            }
        } else if (t == 7) {

            //long start = System.currentTimeMillis();

            ArrayList listOfIndexes = new ArrayList();
            int new_index = 0;
            listOfIndexes.add(0);
            //int last_index;
            //new_index = A[new_index];
//            list.add(new_index);

            while(true) {

                //last_index = new_index;
                new_index = A[new_index];
                listOfIndexes.add(new_index);

                if (new_index >= N)  {
                    System.out.println("Out");
                    return;
                }
                  else if (new_index == N - 1) {
                    System.out.println("Done");
                    return;
                }
                else if (listOfIndexes.contains(A[new_index])) {
                    System.out.println("Cyclic");
                    return;
                }


            } //while (!listOfIndexes.contains(A[new_index]));

            //System.out.println("Cyclic");



            /*for (int i = 1; i < N; i++) {
                if (new_index >= N || new_index < 0) {
                    System.out.println("Out");
                    return;
                } else if (new_index == N - 1) {
                    System.out.println("Done");
                    return;
                } else if () {
                    System.out.println("Cyclic");
                    return;
                } else {
                    last_index = new_index;
                    new_index = A[new_index];
                    list.add(new_index);
                }
            }*/
        }


    }
}
