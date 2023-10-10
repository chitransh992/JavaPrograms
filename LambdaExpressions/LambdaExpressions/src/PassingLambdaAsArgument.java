@FunctionalInterface
interface StringFunc{
    String Func(String n);
}
public class PassingLambdaAsArgument {
    static String StringOp(StringFunc fc,String inputString){
        return fc.Func(inputString);
    }
    public static void main(String[] args) {
        String inputString = "Hello world";
        String outputString;
        System.out.println("Here is the input string: "+inputString);

        outputString = StringOp(String::toUpperCase,inputString);

        System.out.println("The string in uppercase is :"+outputString);

        outputString = StringOp((str)->{
            StringBuilder result = new StringBuilder();
            int n = str.length();
            for(int i = 0;i<n;i++)
            {
                if(str.charAt(i) == ' '){
                    result.append(str.charAt(i));
                }
            }
            return result.toString();
        },inputString);

        System.out.println("After removing spaces te string is :"+outputString);

        outputString = StringOp((str)->{
           StringBuilder result = new StringBuilder();
           int n = str.length()-1;
           for(int i = n;i>=0;i--){
               result.append(str.charAt(i));
           }
          return result.toString();
        },inputString);

        System.out.println("The reversed string is  :"+outputString);

    }
}
