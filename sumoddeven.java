import java.util.Scanner;

public class sumoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        int choice;
        int oddnum=0;
        int evennum=0;

        do{
            System.out.print("add any positiv integer value : ");
            n= sc.nextInt();
        
        
        if (n%2==0) {
            oddnum= oddnum+n;
            
        }
        else{
            evennum = evennum+n;
        }
        System.out.println("you want to exit press 1 for yes or 0 for no");
        choice= sc.nextInt();
        } while(choice==0);

        System.out.println("the addition of odd number is " +oddnum);
        System.out.println("the addition of even number is " +evennum);


    }
}
