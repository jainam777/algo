package arrays;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] ={8,3,7,4,9};
        int target=11;
        sortTheArray(arr);
    }

    private static void sortTheArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i]=temp;
            }
        }
    }
}
