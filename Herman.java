import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area1,area2;

        area1 = r*r*Math.PI;
        System.out.format("%.6f",area1);
        System.out.println();
        area2 = r*r*2;
        System.out.format("%.6f",area2);





    }
}
