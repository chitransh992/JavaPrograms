public class largest_in_array {
    public static void main(String[] args) {
        int[] numArr = {1,2,8,6,4,3};
        int first = numArr[0];

        for(int num : numArr){
            if(first<num){
                first = num;
            }
        }
        System.out.println(first);
    }
}
