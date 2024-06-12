package arrays;

public class LongestSubArray {
    public static void main(String[] args) {
        int arr[] = {-1, 1, 1};
        int target=1;
        int ans = longestSubArray(arr,target);
        System.out.println("O/P:- "+ans);

    }
    public static int longestSubArray(int[] arr,int target) {
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum==target){
                    len= Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
}
