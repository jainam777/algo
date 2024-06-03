package arrays;

public class MergeTwoArray {

    public static int[] mergedArray(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int i = 0,j = 0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                mergedArray[k++] = arr2[j++];
            }
            else{
                mergedArray[k++]=arr1[i++];
            }
        }
        while(i<arr1.length){
            mergedArray[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }
        return mergedArray;
    }

    public static void printArr(int[] arr1){
        int i=0;
      while(i<arr1.length) {
          System.out.println(arr1[i++] + "-");
      }
    }

    public  static  void main(String args[]){
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        int[] ans= MergeTwoArray.mergedArray(arr1,arr2);
        printArr(ans);
    }
}
