import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int M = sc.nextInt();

        DayOfWeek day  = LocalDate.of( 2009 ,M ,D ).getDayOfWeek();

        // Convert the day to string
        String name = day.toString();

        // convert the letters from 2nd to last to lowercase
        String output = name.substring(0,1)+name.substring(1).toLowerCase();
        System.out.println(output);

    }
}
