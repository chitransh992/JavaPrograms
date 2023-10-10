package GenericClasses;

interface MyLambda3{
    void display();
}
class useLambda{
    public void callLambda(MyLambda s){
        s.display();
    }
}
class Demo{
    public void method1(){
        useLambda useLambda = new useLambda();
        useLambda.callLambda(()->{System.out.println("Hello");});
    }

}
public class LambdaExpression3 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();

    }

}
