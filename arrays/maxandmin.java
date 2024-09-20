public class maxandmin {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        System.out.println("the maximum elements from the array is : "+getnumber(numbers));

    }
    public static int getnumber(int numbers[])
    {
        int max= Integer.MIN_VALUE;    ///for getting minimum value 
        int min = Integer.MAX_VALUE;   ///for getting maxmimum value and then using we can iterate to each loop and compare the value if we found lowest value then assign the value to min variable.
        for(int i = 0; i<numbers.length; i++)           //for comparing each element value 
        {
            if(max<numbers[i])
            {
                max=numbers[i];         //if any element found which is greater than  then stored in max variable
            }
            if (min>numbers[i]) {
                min=numbers[i];

                
            }
        }
        System.out.println("the minimum value from the given array is : "+min);
        return max;
    }
}
