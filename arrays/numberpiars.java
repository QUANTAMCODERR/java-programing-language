public class numberpiars {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        pairs(numbers);
    }
    public static void pairs(int numbers[])
    {
        int countpairs=0;
        for(int i = 0; i < numbers.length; i++)
        {
            int curr=numbers[i];
            for (int j = i+1; j<numbers.length; j++)
            {
                System.out.print("("+curr+","+numbers[j]+")");
                countpairs++;
            }
            System.out.println();
        }
        System.out.println("count pairs = "+countpairs);
    }
}
