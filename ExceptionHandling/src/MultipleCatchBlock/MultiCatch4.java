    package MultipleCatchBlock;

    import java.lang.reflect.Array;

    // Always maintain the order of Exceptions
    public class MultiCatch4 {
        public static void main(String[] args) {
            try{
                int array[] = new int[5];
                System.out.println(array[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index out of Bound Exception occurs....");
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception occurs...");
            }
            catch(Exception e){
                System.out.println("Parent Exception Occurs");
            }
            System.out.println("Rest of the code !!!");
        }
    }
