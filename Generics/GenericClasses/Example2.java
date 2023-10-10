package GenericClasses;

public class Example2 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 2, 1};
        int limit = 3;

        int i = 0;
        int j = arr.length - 1;


        int count = 0;
        while (i <= j) {
            if (arr[i] + arr[j] <= limit) {
                i++;
                count++;
            }
            j--;
        }
        System.out.println(" " + count);
    }
}
