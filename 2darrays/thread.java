public class thread {
    public static void main(String[] args) {
        myThread t1 = new myThread(new A());
        myThread t2 = new myThread(new B());
        t1.start();
        t2.start();
    }
    
}
class A implements Runnable
{
    public void run()
    {
        for(int i=0; i<=10 ; i++)
        System.out.println("thread A "+i);
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0; i<=10; i++)
        System.out.println("thread B "+i);
    }
}