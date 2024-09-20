import java.util.Scanner;

public class pallin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int onumber= n;
        int rev=0;
        int rem=0;

        while(onumber != 0){
            rem=onumber%10;
            rev=rev*10+rem;
            onumber=onumber/10;
        } 
        if (n==rev) {
            System.out.println(n + " is pallidrome number");
            
        }
        else{
            System.out.println(n + " is not pallindrome number");
        }
    }
}
