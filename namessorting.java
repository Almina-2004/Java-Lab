import java.util.Scanner;
class namessorting//Question 9 part 2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++)
            names[i] = sc.nextLine();
        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Sorted names:");
        for (int i = 0; i < 5; i++)
            System.out.println(names[i]);
        sc.close();
    }
}


  