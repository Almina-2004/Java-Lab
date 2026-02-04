import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();       // 1) user enters the string

        char[] arr = s.toCharArray();   // 2) convert to char array
        Arrays.sort(arr);               // 3) sort the characters

        String sorted = new String(arr); // 4) convert back to string
        System.out.println("Sorted string: " + sorted);
    }
}
