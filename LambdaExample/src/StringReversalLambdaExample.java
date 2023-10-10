@FunctionalInterface
interface Reverse{
    String reverse(String str);
}
public class StringReversalLambdaExample {
    public static void main(String[] args) {
        Reverse rev = (str)->{
          int n = str.length()-1;
          String result = "";
          for(int i = n;i>=0;i--){
              result = result+str.charAt(i);
          }
          return result;
        };
        System.out.println("The reverse of the string Xebia is :"+rev.reverse("Xebia"));
    }
}
