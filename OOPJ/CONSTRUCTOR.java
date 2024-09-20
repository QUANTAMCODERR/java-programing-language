public class CONSTRUCTOR {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        
    }

    static class Pen
    {
        String color;
        int tip;

        pen()
        {
            System.out.println("the pen constructor is created");
        }
    }
}
