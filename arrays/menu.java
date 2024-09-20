import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menucard[] = {"samosa","kachori","dosa","idli","pavbhaji","jilebi","misal"};
        String key = sc.next();

        
        int index = menuu(menucard, key);

        if (index==(-1)) {
            System.out.println("not found");
            
        }
        else{
            System.out.println("item found at index : "+index);
        }


    }

    public static int menuu(String menucard[], String key)
    {
        for(int i = 0; i<menucard.length; i++)
        {
            if(menucard[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
}
