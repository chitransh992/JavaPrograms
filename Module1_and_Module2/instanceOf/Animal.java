package instanceOf;

public class Animal {
}class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Dog);
    }
}
