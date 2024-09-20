public class supperr
{
    public static void main(String[] args) {
        B ob=new B();
        
    }

}
class A
{
   A()
   {
    System.out.println("this is constructor of class A");
   }
}
class B extends A
{
    
    B()
    {
        super();
        System.out.println("this is constructor of class B");
        
    }
    
}