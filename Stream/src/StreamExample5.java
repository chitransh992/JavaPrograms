import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.stream.Stream;

public class StreamExample5 {
    public static void filterByEvenElements(){
        Integer[] myArray = new Integer[] {1,2,3,4,5,6,7,8};

        Stream.of(myArray).filter(i->i%2 == 0).forEach(System.out::println);
    }
    public static void filterByStartWith(){
        String[] myArray = new String[] {"I","Like","to","Swim"};

        Stream<String> myStream = Stream.of(myArray);
        myStream.filter(i->i.startsWith("Swim")).forEach(System.out::println);
    }
    public static void filterByVowel(){
        String[] myArray = new String[] { "Hii I ....am is Chitransh Mathur"};

        Stream<String> myStream = Stream.of(myArray);
        myStream.filter(i->i.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);
    }
    public static void main(String[] args) {
        filterByEvenElements();
        System.out.println("-----------");
        filterByStartWith();
        System.out.println("-----------");
        filterByVowel();
    }
}
