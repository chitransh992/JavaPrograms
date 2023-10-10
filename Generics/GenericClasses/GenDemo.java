package GenericClasses;

class Gen<T>{
    T object;

    Gen(T ob){
       object = ob;
    }

    T getob()
    {
        return object;
    }
    void showType(){
        System.out.println("Type of T is  :"+object.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iObj;

        iObj = new Gen<Integer>(88);

        iObj.showType();

        int value = iObj.getob();

        System.out.println("Value is :"+value);

        System.out.println();


        Gen<String> strObj = new Gen<String> ("Generic Test");

        strObj.showType();

        String string = strObj.getob();

        System.out.println("Value :"+string);
    }
}
