import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check pallindrome or not : ");
        int num = sc.nextInt();

        
        if(pallin(num))
        {
            System.out.println("the given number is pallindrom");
        }
        else{
            System.out.println("the enter number is not pallidrom");

    }
}
    public static boolean pallin(int num)
    {
        int rev =0;

        int temp = num;

        while (temp!=0) {
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;

        }return num==rev;
        
        }
    }
