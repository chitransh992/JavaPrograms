import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Mango");
        arrayList.add("Banana");

        for(String str : arrayList){
            System.out.println(str);
        }
    }

}
