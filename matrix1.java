import java.util.Scanner;
public class matrix1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("Enter the no of Rows:");
        r=sc.nextInt();
        System.out.print("Enter the no of Columns:");
        c=sc.nextInt();

        int[][] A=new int[r][c];
        System.out.print("Enter the first matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }

        int[][] B=new int[r][c];
        System.out.print("Enter the Second matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        int[][] Sum=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Sum[i][j]=A[i][j]+B[i][j];
            }
        }

        System.out.print("Added Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(Sum[i][j]+" ");
            }
              System.out.println(" ");
        }
        sc.close();
    }
}