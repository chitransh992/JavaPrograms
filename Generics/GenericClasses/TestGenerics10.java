package GenericClasses;

//Usage of TwoParameters in Generic class

class TwoGen<T,V>{
    T object1;
    V object2;

    TwoGen(T o, V v){
        object1 = o;
        object2 = v;
    }

    void showTypes(){
        System.out.println("Value of T is : "+object1.getClass().getName());
        System.out.println("Value of V is :"+object2.getClass().getName());
    }
    T getObject1(){
        return object1;
    }
    V getObject2(){
        return object2;
    }

}

public class TestGenerics10 {
    public static void main(String[] args) {
        TwoGen<Integer,String> twoGenObject = new TwoGen(88,"Generics");
        twoGenObject.showTypes();
        int v = twoGenObject.getObject1();
        System.out.println("Value as Integer: "+v);
        String t = twoGenObject.getObject2();
        System.out.println("Value as String:"+t);
    }
}
