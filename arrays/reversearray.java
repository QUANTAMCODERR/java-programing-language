public class reversearray {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,8,9,10};

        reverse(numbers);

        for(int i = 0 ; i<numbers.length-1; i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }

    public static void reverse(int numbers[])
    {
        int start = 0; int end = numbers.length - 1;  
        while (start<end) {
            int temp=numbers[end];
            numbers[start]=numbers[end];
            numbers[start]=temp;

            start++;
            end--;

            
            
        }
    }
}
