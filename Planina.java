import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iteration;
        iteration = sc.nextInt();
        System.out.println((int)Math.pow(Math.pow(2,iteration)+1,2));
    }
}
