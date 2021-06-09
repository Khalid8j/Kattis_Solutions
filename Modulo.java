//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) /* throws FileNotFoundException */{

        //Scanner sc = new Scanner(new File("1.in"));
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];

        HashMap <Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        //Using HashMap to Print All Distinct Elements

        for (int i = 0; i <10; i++) {
            arr[i] = sc.nextInt() % 42;
            hashMap.put(arr[i],i); //Adding elements from arr to hashMap
        }
        System.out.println(hashMap.keySet().size());
        // keySet() makes a set of elements of hashMap (displays the distinguish values)
    }
}
