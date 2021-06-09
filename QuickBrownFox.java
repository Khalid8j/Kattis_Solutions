import java.util.*;

public class QuickBrownFox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String myString = "abcdefghijklmnopqrstuvwxyz";
        List<String> lettersList = Arrays.asList(myString.split(""));
        ArrayList missingLetters = new ArrayList();
        Set<String> phraseLetters = new HashSet<>();

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals(""))
                continue;

            str = str.toLowerCase();
            String[] phraseArr = str.split("");
            missingLetters.clear();
            phraseLetters.clear();

            phraseLetters = new HashSet<>(Arrays.asList(phraseArr));
            for (int i = 0; i < lettersList.size(); i++) {
                if (!phraseLetters.contains(lettersList.get(i)))
                    missingLetters.add(lettersList.get(i));
            }

            if (missingLetters.size() == 0) {
                System.out.println("pangram");
                continue;
            }

            System.out.print("missing ");
            for (int i = 0; i < missingLetters.size(); i++) {
                System.out.print(missingLetters.get(i));
            }
            System.out.println();


        }

    }
}
