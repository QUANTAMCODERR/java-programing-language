import java.util.Scanner;

public class evenornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        iseven(n);
    }

    public static boolean iseven(int n)
    {

    boolean eve;
    
    if(n%2==0){
        eve = true;
    }
    else{
        eve = false;
    }
    System.out.println("if the given value is even then return true otherwise false : "+eve);
    return eve;
}
}