public class vararg 
{
    static void vartest(int...var)
    {
        System.out.println("numberr of argument:"+ var.length+"contents:");
        for(int x : var) 
        System.out.println((x+" "));
        System.out.println();

        
    }
    public static void main(String[] args) {
        vartest(10);
        vartest(2,4,4);
        vartest();
    }
}

    

