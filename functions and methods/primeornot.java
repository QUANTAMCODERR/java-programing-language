// import java.util.*;

// public class primeornot {
//     public static boolean prime(int n)
//     {
//         for(int i = 2; i<=n-1; i++){
//             if (n%i==0) {
//                 return false;
//             }
//         }return true; 
// }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the value of n : ");
//         int n = sc.nextInt();

//         System.out.println("the given value is "+ prime(n));

//     }
// }


//more optimised way 

import java.util.Scanner;

public class primeornot{
    public static boolean isprime(int n)
    {
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                return false;
                
            }
        }
        return true;

    }
    public static void pir(int n)
    {
        for(int i = 2; i<=n; i++)
        {
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of n :");
        int n = sc.nextInt();
        pir(n);
    }
}