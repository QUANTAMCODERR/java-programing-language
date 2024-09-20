// creating threads using Thread class

class Tushar extends myThread
{
    public void run ()
    {
        System.out.println("this is tushar....created using Thread class");
    }

}
public class MT
{
    public static void main(String[] args) {
        Tushar t = new Tushar();
        t.start();;
    }
}