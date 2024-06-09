package arrays;

public class LongestSubArray {
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,9};
        int target=10;
        int ans = longestSubArray(arr,target);
        System.out.println("O/P:- "+ans);

    }
    public static int longestSubArray(int[] arr,int target) {
       // int arr[] = {2,7,4,1,9};
        return arr[0];
    }
}
