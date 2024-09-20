import java.util.Scanner;

public class bintodec {
    public static int dec(int n)
{
    int lastdigit=0;
    int pow=0;
    int decimal=0;
    
    while (n>0)
        
    {
        lastdigit = n%10;
        decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
        n=n/10;
        pow++;
    }
    System.out.println("the binary to decimal conversion is : "+decimal);
    return decimal;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the binary value : ");
    int n = sc.nextInt();
    dec(n);
}
}
