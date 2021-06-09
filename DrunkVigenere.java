import java.util.Scanner;

public class DrunkVigenere {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("1.in"));


        String encWord = sc.nextLine();
        String key = sc.nextLine();
        String decWord = "";

        for (int i = 0; i <encWord.length() ; i++) {
            char encLetter = encWord.charAt(i);
            char keyLetter = key.charAt(i);
            int encNum = encLetter - 65;
            int keyNum = keyLetter - 65;
            int temp = 0;

            if (i % 2 == 0)
                temp = ((encLetter - keyLetter) % 26) + 65;
            else
                temp = ((encLetter + keyLetter) % 26) + 65;

            decWord += (char) temp;
        }
        System.out.println(decWord);





    }
}
