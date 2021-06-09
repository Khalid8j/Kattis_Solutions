import java.util.Scanner;

public class NoDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] words;
        words = str.split(" ");

        int i = 0;
        for (String word : words) {

            for (int j = i + 1; j < words.length; j++) {
                if (word.equals(words[j])) {
                    System.out.println("no");
                    return;
                }
            }
            if (i == words.length - 1) {
                System.out.println("yes");
                return;
            }
            i++;
        }

    }

}

