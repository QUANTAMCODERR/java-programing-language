import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enterr a number : ");
        int n = sc.nextInt();
        boolean isprime= true;
        for(int i =2; i<=n-1; i++)
        {
            if (n%i==0) {
                isprime= false; 
                break;
            }
            

        }
        if (isprime) {
            System.out.println(n + " is a prime number");
            
        }
        else{
            System.out.println(n + " is not prime number");
        }
        
    }
}
