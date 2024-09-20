import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a number of which table you want : ");
        int n = sc.nextInt();
        int num=10;

        for(int i = 1; i <= num; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
 