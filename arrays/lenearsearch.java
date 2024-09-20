import java.util.*;

public class lenearsearch {
    public static int searching(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {    //condition for checking the key are in array or not
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.print("enter key to find : ");
        int key = sc.nextInt();
        
        int index = searching(numbers, key);  // created index variable to stored the values of functions

        if (index == -1) {
            System.out.println("the number not found in array");

        } else {
            System.out.println("the key found at index : " + index);
        }
    }
}