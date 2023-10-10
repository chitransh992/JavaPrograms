
@FunctionalInterface
interface MyLambda11{
    void displayValues();
}
//class Myclass implements MyLambda11{
//
//
//}
class LambdaExample2{
    public static void main(String[] args) {
        MyLambda11 myclass = new MyLambda(){
            @Override
            public void display() {

            }

            @Override
            public void displayValues() {
                System.out.println("Hello world");
            }
        };
        myclass.displayValues();
    }
}