public class Test extends Thread {
    public void run()
    {
        System.out.println("daemon thread is working...");
    }

    public static void main(String[] args) {
        System.out.println("main thread is working...");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}
