public class abstrract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
abstract class Animal
{
    abstract void eat();
    {
        System.out.println("i am eating...");
    }

}
class Dog extends Animal{
    void eat()
    {
        System.out.println("dog is eating");
    }
}
