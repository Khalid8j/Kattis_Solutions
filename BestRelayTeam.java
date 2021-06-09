import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BestRelayTeam {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("1.in"));
        int t = sc.nextInt();
        ArrayList <String> names = new ArrayList<>();
        ArrayList <String> namesInOrder = new ArrayList<>();
        ArrayList <Double> firstLeg = new ArrayList<>();
        ArrayList <Double> otherLegs = new ArrayList<>();


        for (int i = 0; i <t ; i++) {
        names.add(sc.next());
        firstLeg.add(sc.nextDouble());
        otherLegs.add(sc.nextDouble());
        }

        ArrayList <Double> frst = new ArrayList<>(firstLeg);
        ArrayList <Double> other = new ArrayList<>(otherLegs);
        Collections.sort(frst);
        Collections.sort(other);

        System.out.println(firstLeg);
        System.out.println(otherLegs);
       // System.out.println(frst);
       System.out.println(other);

        int index;

        for (int i = 0; i <t ; i++) {
            index = firstLeg.indexOf(frst.get(0));
            namesInOrder.add(names.get(index));
        }
        System.out.println(namesInOrder);










    }
}
