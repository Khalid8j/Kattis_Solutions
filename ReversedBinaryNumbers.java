import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        StringBuilder s = new StringBuilder(binary); // StringBuilder has a method reverses a string
        binary = s.reverse().toString(); // reverse the number and convert it to String
        int decimal = Integer.parseInt(binary,2); // 2 refers to binary system
        System.out.println(decimal);
    }
}
