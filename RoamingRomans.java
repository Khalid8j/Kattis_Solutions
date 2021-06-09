import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float englishMile = sc.nextFloat();
        final int englishFeet = 5280;
        final int romanFeet = 4854;

        float newFeet;
        newFeet = englishFeet*englishMile*1000/romanFeet;
        System.out.println(Math.round(newFeet));


    }
}
