package RunTimePolymorphism;

public class TestPolymorphism2 {
    public static void main(String[] args) {
        Animal a;
        a = new cat();
        a.eat();
        a = new Dog();
        a.eat();
        a = new Dog();
        a.eat();
        a = new Lion();
        a.eat();
    }
}
