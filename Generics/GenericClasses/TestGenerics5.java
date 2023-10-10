package GenericClasses;

import java.util.ArrayList;


class MyGeneric<T1>{
    int value =443;
    private T1 t1;

    public MyGeneric(int value,T1 t1) {
        this.value = value;
        this.t1 = t1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class TestGenerics5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);

        int a = arrayList.get(0);

        MyGeneric<String> g1 = new MyGeneric(23,"MyString");

        String ans = g1.getT1();
        System.out.println(ans);
    }
}
