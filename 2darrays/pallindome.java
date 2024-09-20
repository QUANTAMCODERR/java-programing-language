import java.util.Scanner;

public class pallindome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your string for checking pallindrome : ");
        String str = sc.next();
        palin(str);
    }
    public static boolean palin(String str)
    {
        for (int i=0; i<str.length()/2; i++)
        { 

            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                System.out.println("the string iis not palindome : ");
                return false;
            }
        }
        System.out.println("the string iis palindrome : ");
        return true;
    }
}
