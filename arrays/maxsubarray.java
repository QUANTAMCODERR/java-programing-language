public class maxsubarray {
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};

        int currNum=0;
        int maxSum = Integer.MIN_VALUE;
        maxsub(num, currNum, maxSum);


    }
    public static void maxsub(int num[], int currNum, int maxSum)
    {
        for(int i = 0; i<num.length; i++)
        {
            for(int j =i ; j<num.length; j++)
            {
                currNum=0;

                for(int k = i; k<=j ; k++)
                {

                    currNum+=num[k];
                }
                System.out.println(currNum);

                if (maxSum<currNum) {
                    maxSum=currNum;
                }
            }
        }
        System.out.println("the max pair of sub arrays are : "+maxSum);
    }
}
