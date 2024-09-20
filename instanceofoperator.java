public class instanceofoperator {
    public static void main(String[] args) {
        instanceofoperator s = new instanceofoperator();
        System.out.println(s instanceof instanceofoperator);

        dog d = new dog();
        System.out.println(d instanceof dog);
        System.out.println(d instanceof animal);
    }
}

class animal
{
    void run()
    {
        System.out.println("the dog is barking...");
    }
}
class dog extends animal
{
    void run()
    {
        System.out.println("the dog is not barking");
    }
}
