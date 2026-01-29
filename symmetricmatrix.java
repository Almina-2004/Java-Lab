import java.util.Scanner;

public class symmetricmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the no of Columns: ");
        int c = sc.nextInt();

        // Check if matrix is square
        if (r != c) {
            System.out.println("Matrix must be square to be symmetric.");
            sc.close();
            return;
        }

        int[][] A = new int[r][c];

        System.out.println("Enter the Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (A[i][j] != A[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) break;
        }

        if (symmetric) {
            System.out.println("This is a Symmetric Matrix.");
        } else {
            System.out.println("This is NOT a Symmetric Matrix.");
        }

        sc.close();
    }
}
