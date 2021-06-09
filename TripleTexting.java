import java.util.Scanner;

public class TripleTexting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int wordLength = str.length()/3;


        String word1 = str.substring(0,wordLength);
        String word2 = str.substring(wordLength,wordLength*2);
        String word3 = str.substring(wordLength*2);

        if (word1.equals(word2))
            System.out.println(word1);
        else if (word1.equals(word3))
            System.out.println(word1);
        else
            System.out.println(word2);



    }
}
