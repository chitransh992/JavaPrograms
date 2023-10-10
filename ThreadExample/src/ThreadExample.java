import javax.rmi.ssl.SslRMIClientSocketFactory;

class A extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Thread A :"+i);
        }
        System.out.println("Exit from Thread A");
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Thread B :"+i);
        }
        System.out.println("Exit from Thread B");
    }
}
class C extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Thread C :"+i);
        }
        System.out.println("Exit from Thread C");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A object1 = new A();
        object1.start();
        B object2 = new B();
        object2.start();
        C object3 = new C();
        object3.start();
    }
}
