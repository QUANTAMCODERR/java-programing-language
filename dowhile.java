import java.util.Scanner;

public class dowhile {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     do{
       System.out.print("enter the number :");
       int  n = sc.nextInt();

       if (n%10==0) {
         continue; 
       }
       System.out.println(n);
      }while(true);
      
      
   }

}
     
   