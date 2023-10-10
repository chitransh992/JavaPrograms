package GenericClasses;

import java.util.ArrayList;

public class TestGeneric7 {

    public static<T> Double add(ArrayList<? extends Number> num){
        double sum = 0.0;

         for(Number n : num){
             sum += n.doubleValue();
         }
         return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Display the sum :"+add(arrayList));
    }
}
