import java.util.Scanner;

public class first{
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        
    }
    int key = sc.nextInt();

    public static boolean matrixsearch(int matrix[][],int key)
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix.length; j++)
            {
                if (matrix[i][j]==key){
                    System.out.println("the key found at ("+i+","+j+")");
                    return true;
                }
            }
            
        }
        System.out.println("key does not found");
            return false;
    }
}