import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        //taking input by creating scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("the addition of num1 and num2 is = "+sum);
        sc.close();

    }
}
