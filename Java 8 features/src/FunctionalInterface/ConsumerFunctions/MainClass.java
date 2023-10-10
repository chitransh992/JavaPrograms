package FunctionalInterface.ConsumerFunctions;

import java.util.function.Consumer;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        Consumer<Person> setName = t-> t.setName("Ankit");
        setName.accept(person);
        System.out.println(person.getName());
    }
}
