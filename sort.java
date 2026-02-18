import java.util.Scanner;
class stringsorting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = sc.nextLine();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++)
        {
            for (int j = 0; j < charArray.length - i - 1; j++)
            {
                if (charArray[j] > charArray[j + 1])
                {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }
        String sortedStr = new String(charArray);
        System.out.println("Sorted string: " + sortedStr);
    }
}

  