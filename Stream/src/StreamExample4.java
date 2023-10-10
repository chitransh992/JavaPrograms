import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        Stream<String> myStream = Stream.of("Hii","This","is","me");

        myStream.filter(x->x.startsWith("This")).forEach(System.out::println);
    }
}
