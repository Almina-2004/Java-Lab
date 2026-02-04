import java.util.Scanner;
class complex
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int real1,img1,real2,img2,Rsum,Isum;
        System.out.print("Enter the Real part of first number:");
        real1=sc.nextInt();
        System.out.print("Enter the Imaginary part first number:");
        img1=sc.nextInt();
        System.out.print("Enter the Real part of second number:");
        real2=sc.nextInt();
        System.out.print("Enter the imaginary part of second number:");
        img2=sc.nextInt();

        Rsum=real1+real2;
        Isum=img2+img2;

        System.out.print("The sum of Complex Numbers are:"+Rsum+"+"+Isum+"i");
        sc.close();

    }
}