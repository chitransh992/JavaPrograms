package MultipleCatchBlock;

//Array Index Out of Bound Multi Catch Exception
public class MultiCatch1 {
    public static void main(String[] args) {
        try{
            int array[] = {1,2,3};
            System.out.println(array[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception");
        }
        catch (Exception e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest Of the code !!");
    }
}
