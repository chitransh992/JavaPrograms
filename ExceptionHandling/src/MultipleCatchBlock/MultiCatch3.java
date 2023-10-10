package MultipleCatchBlock;

//Parent Exception Occurs
public class MultiCatch3 {
    public static void main(String[] args) {
        try{
            String string = null;
            System.out.println(string.length());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound Exception Occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest of the Code !!");
    }
}
