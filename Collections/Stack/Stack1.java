import java.util.Iterator;
import java.util.Stack;
public class Stack1{
    public static void main(String[] args) {
        Stack<String> str = new Stack<String>();

        str.push("Ramesh");
        str.push("Suresh");
        str.pop();
        str.push("Naresh");

        Iterator<String> itr = str.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
