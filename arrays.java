import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
        // creating scanner object for the input

        Scanner sc = new Scanner(System.in);

        int[][] rows = new int[3][3];


        // taking input for rows and columns 
        for(int i = 0; i <rows.length; i++){
            for (int j = 0; j<rows.length; j++){
                rows[i][j]=sc.nextInt();
            }
            display(rows);
        }

        // output
        // for(int i = 0; i <rows.length; i++){
        //     for (int j = 0; j<rows.length; j++){
        //         System.out.print(rows[i][j] + " ");
        //     }
        //     System.out.println();
        // }



    }
    public static void display(int rows[]){
     for (int a:rows){
         System.out.println(a);
     }
    }
}
