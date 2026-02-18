import java.util.Scanner;
public class stringmanipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        // i. Find the length of the string
        System.out.println("Length of string: " + str1.length());

        // ii. Character at second and fourth position
        System.out.println("Character at second position: " + str1.charAt(1));
        System.out.println("Character at fourth position: " + str1.charAt(3));

        // iii. Find substring using start index only
        System.out.println("Substring from index 3: " + str1.substring(2));

        // iv. Find substring using start index and end index
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 5));

        // v. Concatenate a given string to the end of another string
        System.out.println("Concatenated string: " + str1.concat(str2));

        // vi. Convert all characters to lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // vii. Convert all characters to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());
    }
}