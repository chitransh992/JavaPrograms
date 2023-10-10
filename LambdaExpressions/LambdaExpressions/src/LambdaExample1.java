//interface MyNumber{
//    double getValue();
//}
//public class LambdaExample1 {
//    public static void main(String[] args) {
//        MyNumber myNumber;
//        myNumber = ()->123.45;
//
//        System.out.println("A Fixed Number :"+myNumber.getValue());
//
//        myNumber = ()->Math.random()*100;
//
//        System.out.println("Random Value :"+myNumber.getValue());
//        System.out.println("Another Random Value :"+myNumber.getValue());
//    }
//
//}

interface MyLambda{
    void display();
}
class My implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}
public class LambdaExample1{
    public static void main(String[] args) {
        MyLambda myLambda = new My();          
        myLambda.display();
    }
}