package GenericClasses;

public class TestGenerics4 {

    public static<E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'a','b','c','d','e'};

        System.out.println("Printing Integer Array :");
        printArray(intArray);

        System.out.println("Printing character Array :");
        printArray(charArray);


    }
}
