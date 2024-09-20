public class runnablee {
public static void main(String[] args) {
    Tushar t = new Tushar();
    Thread th = new Thread(t);
    th.start();
}
}
class Tushar implements Runnable 
{
    public void run()
    {
        System.out.println("this is tushar...creating thread using interface");
    }
}
