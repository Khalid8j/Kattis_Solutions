import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TextProcessor {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner sc = new Scanner(new File("sample.in"));
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int Q = sc.nextInt();
        int W = sc.nextInt();

        int iQ = 0;


        for (int i = 0; i < Q; i++) {
            iQ = sc.nextInt();
            //printSubStrings(str.substring(iQ - 1, iQ + W - 1));
            //System.out.println(distinctSubstring(str.substring(iQ - 1, iQ + W - 1)));
            substringSize(str.substring(iQ - 1, iQ + W - 1));
        }
    }
/*
    public static int distinctSubstring(String str) {
        // Put all distinct substring in a HashSet
        Set<String> result = new HashSet<String>();
        // List All Substrings
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // Add each substring in Set
                result.add(str.substring(i, j));
            }
        }
        // Return size of the HashSet
        return result.size();
    }*/
/*
    static void printSubStrings(String s)
    {

        // To store distinct output subStrings
        HashSet<String> us = new HashSet<String>();

        // Traverse through the given String and
        // one by one generate subStrings beginning
        // from s[i].
        for (int i = 0; i < s.length(); ++i)
        {

            // One by one generate subStrings ending
            // with s[j]
            String ss = "";
            for (int j = i; j < s.length(); ++j)
            {
                ss = ss + s.charAt(j);
                us.add(ss);
            }
        }

        System.out.println(us.size());
        // Print all subStrings one by one
        /*for (String str : us)
            System.out.print(str + " ");*/

        //System.out.println();


    public static void substringSize(String str) {
        Set<String> hash_Set = new HashSet<String>();

        //String tab [] = new String[10];
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                hash_Set.add(str.substring(i,j));
                //System.out.println(str.substring(i,j));
                k++;

            }

        }
        System.out.println(hash_Set.size());

    }
}

