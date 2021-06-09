import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ANewAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();

        String[] symbols = {
                "@", "8", "(", "|)",
                "3", "#", "6", "[-]",
                "|", "_|", "|<", "1",
                "[]\\/[]", "[]\\[]",
                "0", "|D", "(,)", "|Z",
                "$", "']['", "|_|",
                "\\/", "\\/\\/", "}{", "`/",
                "2"
        };

        List<String> list = Arrays.asList(symbols);

        ArrayList lowercase_List = new ArrayList();
        for (char i = 'a'; i <= 'z'; i++) {
            lowercase_List.add(i);
        }


        int index = 0;
        for (int i = 0; i <str.length(); i++) {

            if (lowercase_List.contains(str.charAt(i))) {
                index = lowercase_List.indexOf(str.charAt(i));
                str = str.replace(str.charAt(i)+"", list.get(index));
            }
        }
        System.out.println(str);


        /*for (int i = 0; i <symbols.length ; i++) {
            System.out.println(i+1 +": "+symbols[i]);

        }*/



    }
}



