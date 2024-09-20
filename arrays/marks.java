// import java.util.Scanner;

// public class marks
// {
//     public static void main(String [] args)
// {
//     int marks[] = new int[10];
//     Scanner sc = new Scanner(System.in);

//     System.out.print("enter physics marks : ");
//     marks[0] = sc.nextInt();

//     System.out.print("enter chemistry marks : ");
//     marks[1] = sc.nextInt();

//     System.out.print("enter maths marks : ");
//     marks[2] = sc.nextInt();

//     System.out.println(" physics : "+marks[0]); //printing physics marks
//     System.out.println("chemistry : "+marks[1]);
//     System.out.println("maths : "+marks[2]);

//     marks[2]=100;                   //for updating the maths marks 
//     System.out.println("maths : "+marks[2]);
    


//     int percentage = ( marks[0] + marks[1] + marks[2]) / 3;     //for calculating the percentage of total marks
//     System.out.println("the total percentage : "+percentage+"%");

//     System.out.println("\n\n\n\n");
//     System.out.println("the length of an array : "+marks.length);
// }

// }



// changing the marks of array 

public class marks
{
    public static void main(String[] args) {
        int marks[]= {98,99,97};
        int sub = 5; // integer variable value does not changed it works as call by value
        updat(marks,sub);
        System.out.println(sub);

        for(int i = 0 ; i<marks.length; i++)
        {
            System.out.println(marks[i]+" ");  //but array value has changed means in array it works as call by reference

        }
        System.out.println();
    }
    public static void updat(int marks[], int sub)
    {   sub=10;
        for(int i = 0; i<marks.length; i++)
        {
            marks[i]=marks[i]+1;
        }
        System.out.println();
    }
}