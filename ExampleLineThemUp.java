import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExampleLineThemUp {
    public static void main(String[] args) throws FileNotFoundException {

            //Scanner sc = new Scanner(new File("data.in"));
            Scanner sc = new Scanner(System.in);

        int t=Integer.parseInt(sc.nextLine());

        ArrayList<String> list =new ArrayList();
        ArrayList<String> increasedList =new ArrayList();
        ArrayList<String> decreasedList =new ArrayList();

        String str;

        for (int i = 0; i < t; i++) {
            str = sc.nextLine();
            list.add(str);
            increasedList.add(str);
            decreasedList.add(str);
        }

        //System.out.println("The entered array: "+(list));

        Collections.sort(increasedList); //To sort array in increasing order
        //System.out.println("increased array: "+ (increasedList));
        Collections.sort(decreasedList,
                Collections.reverseOrder()); // To sort array in decreasing order
        //System.out.println("Decreased array: "+(decreasedList));


        if (!list.equals(decreasedList) && !list.equals(increasedList))
            System.out.println("NEITHER");

        else if (list.equals(decreasedList))
            System.out.println("DECREASING");

        else if (list.equals(increasedList))
            System.out.println("INCREASING");


    }
}


