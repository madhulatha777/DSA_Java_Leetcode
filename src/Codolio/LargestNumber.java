package Codolio;
public class LargestNumber {
    public static int largest(int[] arr) {
        int n = arr.length;
        int large = arr[0];
        for(int i=0; i < n; i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,12,78,2,1,4};
        System.out.println(largest(arr));
    }
}
