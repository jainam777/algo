package arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1};
        int and= maxSubArray(arr);
        System.out.println("O/p:- "+and);
    }
    public static int maxSubArray(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxi= Math.max(maxi,sum);
            }
        }
        return maxi;
    }

}
