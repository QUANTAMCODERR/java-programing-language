//program for daemon thread.

public class TestDaemonThread1 extends myThread
{
public void run()
{
    if(myThread.currentThread().isDaemon())
    System.out.println("daemon thread work ");

else

    System.out.println("user thread work    ");
}

public static void main(String[] args) {
    TestDaemonThread1 t1 = new TestDaemonThread1();
    TestDaemonThread1 t2 = new TestDaemonThread1();
    TestDaemonThread1 t3 = new TestDaemonThread1();

    t1.setDaemon(true);
    t1.start();
    t2.start();
    t3.start();
}
}