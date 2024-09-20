import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("plz enter your choice for  1)samosa 2)burger 3)kachori 4)pizza);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("samosa");
                
                break;
            case 2: System.out.println("burger");

                break;

            case 3: System.out.println("kachori");
                break;

            case 4: System.out.println("pizza");
                break;
        
            default: System.out.println("wrong choice");
                break;
        }
    }
}
