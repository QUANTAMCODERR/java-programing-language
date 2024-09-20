import java.util.Scanner;

public class addition{
   /*  public static int sumof(int a , int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");

        int b = sc.nextInt();
        int sum= sumof(a, b);
        System.out.println("the sum is : "+sum);
        
    }
}
*/


// swapping of two values using temp function

/* 
public static void main(String[] args) {
    int a =10;
    int b = 5;
    
    System.out.println("before swapping the value of a : "+a);
    System.out.println("before swapping the value of b : "+b);

    swap(a, b);



}
public static void swap(int a , int b) {
    int swap=a;
    a=b;
    b=swap;
    System.out.println("after swapping the value of a : "+a);

    System.out.println("before swapping the value of b : "+b);

    
}
}
*/

//product of two values

/*
public static int multiplication(int a, int b) {
    int product = a*b;
    return product;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enterr the first value of a : ");
    int a = sc.nextInt();
    System.out.print("enter the second value of b : ");
    int b = sc.nextInt();
    
    int prod = multiplication(a, b);
    System.out.print("the product of a and b is : "+prod);
}
}
*/

//factorial of number

public static int factorial(int n)
{
    int fact = 1;
    for(int i = 1; i <=n; i++)
    {
        fact= fact * i;
    }
    return fact;
}
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number : ");
    int n = sc.nextInt();

    System.out.println("the factorial of " + n+ " is : " + factorial(n));
}
}