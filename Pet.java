import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int [5];
        int sum = 0;
        int biggest = 0;
        int index = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <4 ; j++) {
                sum += sc.nextInt();
            }
            arr[i] = sum;
            sum = 0;
            if (arr[i] > biggest) {
                biggest = arr[i];
                index = i;
            }
        }
        System.out.print((index+1)+" "+biggest);

    }
}
