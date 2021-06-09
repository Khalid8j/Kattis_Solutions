import java.util.ArrayList;

public class aaaaa {
    public static void main(String[] args) {

        String arr [] = {"Te","O","N","Al","In","At","I","Rn"};

        String str = "internationalte";
        String s = "te";

        StringBuffer text = new StringBuffer(str);
        // StringBuffer takes the string to manipulate it

        int startIndex = str.indexOf(s.charAt(0));
        // where to start cutting (the index of first character to be removed)
        int endIndex = str.indexOf(s.charAt(1))+1;
        // where to stop cutting (the index of last character to be removed + 1)
        text.replace(startIndex,endIndex,"");
        // 3 arguments (startindex, endindex, the new substring)


        System.out.println(text);
    }
}
