package superKeyword;

class Animal{
    void eat(){
        System.out.println("Eating !!!");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("dog is barking !!");
    }
    void eat(){
        System.out.println("Dog is eating !!");
    }
    void work(){
        super.eat();
        bark();
    }
}

public class testSuper2 {
    public static void main(String[] args) {
        dog e = new dog();
        e.work();

    }
}
