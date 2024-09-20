public class Test extends Thread 
{
    public void run()
   {
    System.out.println("daemon thread is working..");
//     if(Thread.currentThread().isDaemon())
// //     System.out.println("daemon thread is working...");
// //     else
// //     System.out.println("main thread is working...");
// //  
  }
    public static void main(String[] args) {
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}