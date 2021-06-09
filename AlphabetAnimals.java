import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlphabetAnimals {
    public static void main(String[] args) throws FileNotFoundException {

       //Scanner sc = new Scanner(new File("3.in"));
        Scanner sc = new Scanner(System.in);
        String preAnimal = sc.next();
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("?");
            return;
        }
        String [] animals = new String[n];

        for (int i = 0; i < n; i++) {
            animals[i] = sc.next();
        }

        for (int i = 0; i <n ; i++) {
            if (preAnimal.charAt(preAnimal.length()-1) == animals[i].charAt(0)) {
                preAnimal = animals[i];
                if (i == n-1) {
                    System.out.println(animals[i]+"!");
                    return;
                }
                for (int j = 0; j <n; j++) {
                    if (!preAnimal.equals(animals[j])) {
                        if (preAnimal.charAt(preAnimal.length() - 1) == animals[j].charAt(0)) {
                            System.out.println(preAnimal);
                            return;
                        }
                        if (j == n - 1) {
                            System.out.println(animals[i] + "!");
                            return;
                        }
                    }
                }
            }
        }
            System.out.println("?");
    }
}
