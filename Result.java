import java.util.Scanner;

public class Result extends Student implements Sports {

    int sportsScore;

    public void getSportsScore() {   // must be public
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
    }

    void display() {
        System.out.println("\nAcademic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }

    public static void main(String[] args) {

        Result r = new Result();

        r.getAcademicScore();
        r.getSportsScore();
        r.display();
    }
}

class Student {
    int academicScore;

    void getAcademicScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();
    }
}

interface Sports {
    void getSportsScore();
}