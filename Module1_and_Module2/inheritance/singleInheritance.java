package inheritance;

class Animal{
    void eat()
    {
        System.out.println("eating !!");
    }

}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is barking!!");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

    }
}
