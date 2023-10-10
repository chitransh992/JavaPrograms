@FunctionalInterface
interface ReverseString{
    String reverse(String r);
}
public class ReverseAStringLambdaExample {
    public static void main(String[] args) {
        ReverseString reverseString;

        reverseString = (str)->{
            int n = str.length()-1;
            String result = "";

            for(int i = n;i>=0;i--){
                result +=str.charAt(i);
            }
            return result;
        };
        System.out.println("The reversed string of Lambda is :"+reverseString.reverse("Lambda"));
        System.out.println("The reversed string of Expressions is :"+reverseString.reverse("Expressions"));
    }
}
