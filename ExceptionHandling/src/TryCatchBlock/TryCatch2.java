package TryCatchBlock;

public class TryCatch2 {
    public static void main(String[] args) {
        int first = 50;
        int second = 0;
        int result;
        try{
            result = first/second;
        }
        catch(ArithmeticException e){
            System.out.println(first/first+second);
        }

    }
}
