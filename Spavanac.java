
import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(new File("spavanac.2.in"));
        Scanner sc = new Scanner(System.in);
        int H,M;
        H = sc.nextInt();
        M =  sc.nextInt();

        if (M < 45) {
            if (H == 0)
                H = 23;
            else
                H--;
        }
        M-= 45;
        if (M < 0)
            M+= 60;
        System.out.println(H+" "+M);
    }
}
