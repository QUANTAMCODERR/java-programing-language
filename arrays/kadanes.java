public class kadanes {
    public static void main(String[] args) {
        int num[]= {-2,-3,4,-1,-2,1,5,9};
        kadalgo(num);

    }
    public static void kadalgo(int num[])
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i =0; i<num.length; i++)
        {
            cs=cs+num[i];
            ms=Math.max(ms, cs);

            if (cs<0) {
                cs=0;
                }
        }
        System.out.println("the maximum value ="+ms);
    }
}
