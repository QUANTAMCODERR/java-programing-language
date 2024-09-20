import java.util.Scanner;

public class dectobin{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enterr the decimal value for converting into binary form : ");
        int decnum = sc.nextInt();
        decbin(decnum);

    }
    public static int decbin(int decnum)
    {
        int pow=0;
        int bin=0;

        while (decnum!=0) {
            int rem = decnum %2;
            bin = bin + rem*(int)Math.pow(10, pow);
            pow++;
            decnum=decnum/2;
        }
        System.out.println("the conversion of decimal to binary is : "+bin);
        return bin;
    }
}