import java.util.Scanner;

public class sumofinteger {
    public static int summ(int n)
    {
        int rem=0;
        int sum=0;
        
        while(n!=0)
        {
            rem = n%10;
            sum=sum+rem;
            n=n/10;


        }
        System.out.println("the addition of the integer is : "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        summ(n);
    }
}
