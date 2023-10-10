import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        System.out.println("After invoking the first method :"+list);
        list.add(2,"Gaurav");
        System.out.println("After Invoking the second method : "+list);

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("Soo");
        list2.add("Hanuman");
        list.addAll(list2);

        System.out.println("After invoking the addAll method :"+list);


        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("Pankaj");
        list3.add("Gyan");

        list.addAll(list3);

        System.out.println("After invoking the third method :"+list);

    }
}
