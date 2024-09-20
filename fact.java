import java.util.Scanner;

public class fact {
    public static void main(String[] args) {

        public class switchstatement {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int choice = sc.nextInt();
        
                switch (choice) {
                    case 1: System.out.println("samosa");
                        
                        break;
                    case 2: System.out.println("burger");
        
                        break;
        
                    case 3: System.out.println("kachori");
                        break;
        
                    case 4: System.out.println("pizza");
                
                    default: System.out.println("wrong choice");
                        break;
                }
            }
        }
        = new Scanner(System.in);
        System.out.println("enter any positive integer :");

        int n= sc.nextInt();
        int fact = 1 ;
        for(int i = 1; i<=n; i++)
        {
            fact= fact*i;
        }
            System.out.println("factorial of number is "  +fact);
        


    
    }
}
