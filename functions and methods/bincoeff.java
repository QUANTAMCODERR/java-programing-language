import java.util.Scanner;

public class bincoeff {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact=fact*i;
        } return fact;
    }
    public static int bincoefff(int n , int r)
    {
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int factnmr= factorial(n-r);

        int bincoef= fact_n/fact_r*factnmr;
        return bincoef;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("enter the value of r : ");
        int r = sc.nextInt();
        System.out.println("the binomial coefficient is : " + bincoefff(n, r));
    }

}
