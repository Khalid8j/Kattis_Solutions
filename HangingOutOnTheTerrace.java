import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangingOutOnTheTerrace {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int events = sc.nextInt();
        int peopleOnTerrace = 0;
        int notAllowed = 0;

        for (int i = 0; i <events ; i++) {
            String str = sc.next();
            int people = sc.nextInt();
            if(str.equals("enter")) {
                if (peopleOnTerrace+people > limit)
                    notAllowed ++;
                else
                    peopleOnTerrace += people;
            }
            else if (str.equals("leave")) {
                peopleOnTerrace -= people;
            }

        }
        System.out.println(notAllowed);


    }
}
