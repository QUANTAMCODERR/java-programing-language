public class thrreed {
    public static void main(String[] args) {
        
    
    A a = new A();
    a.start();
    }
    
}
class A extends Thread
{
    public void run()
    {
        System.out.println("hello i am tushar creating thread");
    }
}
