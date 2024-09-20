public class trappedwater {
    public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println("the total water trapped is : "+trapped(height));
    

}
public static int trapped(int height[])
{
    int n = height.length;
    int leftmost[]= new int [n];
    leftmost[0]= height[0];

    // calculating left most height
    for(int i= 1; i<n; i++)
    {
        leftmost[i]=Math.max(height[i], leftmost[i-1]);
    }

    // calculating right most height
    int rightmost[]=new int[n];
    rightmost[n-1]=height[n-1];

    for(int i=n-2; i>=0; i--)
    {
        rightmost[i]= Math.max(height[i], rightmost[i+1]);

    }
    int trappedwater=0 ;
    for(int i =0; i<n; i++ )
    {
        int waterlevel=Math.min(leftmost[i], rightmost[i]);
        trappedwater+= waterlevel-height[i];
    }
    return trappedwater;

}
}
