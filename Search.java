import java.util.Scanner;
class search
{
    public static void main(String[] args)
    {
        int i, n, a[], item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the item to search:");
        item = sc.nextInt();
        for (i = 0; i < n; i++)
        {
            if (a[i] == item)
            {
                System.out.println("Item found at index: " + i);
                return;
            }
        }
        System.out.println("Item not found in the array.");
    }
}