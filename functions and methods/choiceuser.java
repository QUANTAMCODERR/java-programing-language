import java.util.Scanner;

public class choiceuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;

        int posnum=0;
        int negnum=0;
        int zero=0;
        int choice;

    do{
        System.out.println("enter a integer :");
        n=sc.nextInt();
        if (n>0) {
           posnum= posnum+1;
        }
        else if(n==0){
            zero=zero+1;
            }

        else{
            negnum=negnum+1;

        }
        System.out.println("enter 1 for continue and 0 for quite");
        choice=sc.nextInt();

    }while (choice != 0);
    System.out.println("the positive integers are entered times"+posnum);
    System.out.println("the negative integers are entered times"+negnum);
    System.out.println("the zero integers are enterd times"+zero);
        
    }
     
        }



