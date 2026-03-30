import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserAuthentication auth = new UserAuthentication();

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        try {
            auth.checkLogin(user, pass);
        } catch (InvalidLoginException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}