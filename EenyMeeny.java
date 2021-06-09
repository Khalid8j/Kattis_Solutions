import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EenyMeeny {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scc= new Scanner(new File("2.in"));
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] song = word.split(" ");
        int songSize = song.length - 1;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();

        int n = sc.nextInt();
        if (n == 1 && songSize % 2 != 0) {
            System.out.println(0);
            System.out.println(1);
            System.out.println(sc.next());
            return;
        }
        else if (n == 1 && songSize % 2 == 0) {
            System.out.println(1);
            System.out.println(sc.next());
            System.out.println(0);
            return;

        }

        while (sc.hasNext()) { // to add the names to the list
            list.add(sc.next());
        }

        int i = 0;
        int counter = 1;

        while (i < list.size()) {

            i = (i+songSize) % list.size();
            if (counter % 2 != 0) { //add the name to the team 1
                team1.add(list.get(i));
                list.remove(list.get(i)); // remove it from the list that we choose from
                counter++;
            }
            else {
                team2.add(list.get(i));
                list.remove(list.get(i));
                counter++;

            }

            if (list.size() == 1)
                i = 0;
        }

        System.out.println(team1.size());
        for (int j = 0; j <team1.size() ; j++) {
            System.out.println(team1.get(j));
        }
        System.out.println(team2.size());
        for (int j = 0; j <team2.size() ; j++) {
            System.out.println(team2.get(j));
        }

    }
}
