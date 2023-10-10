package GenericClasses;

interface MyLambda1{
    int add(int x,int y);
}
//class Myclass implements MyLambda1{
//    public int add(int x,int y){
//      return x+y;
//    }
//}
public class LambdaExpression2 {
    public static void main(String[] args) {
        MyLambda1 lambda=(x,y)-> x+y;
        System.out.println(lambda.add(20,30));
    }
}
